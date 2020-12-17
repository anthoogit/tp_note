import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Canal implements Destinataire, Comparable<Canal>{
    private Map<Rôle, List<Utilisateur>> mapping_role_utilisateurs;
    private int ordre;
    private List<Webhook> webhooks;
    private String nom;
    private Map<Rôle, List<Habilitation>> mapping_role_habilitations;
    private List<Message> historiques;

    public Canal() {
        this.historiques = new ArrayList<Message>();
        this.mapping_role_utilisateurs = new HashMap<Rôle, List<Utilisateur>>();
        this.mapping_role_habilitations = new HashMap<Rôle, List<Habilitation>>();
    }

    public void ecrireMessage(Utilisateur utilisateur, Message message) throws ActionNonAutoriseeException {
        boolean permissionGranted = false;
        List<Rôle> roles = new ArrayList<>();
        for (Map.Entry<Rôle, List<Utilisateur>> entry : mapping_role_utilisateurs.entrySet()) {
            if (entry.getValue().contains(utilisateur)) {
                roles.add(entry.getKey());
            }
        }
        List<Habilitation> habilitations = new ArrayList<>();
        for (Rôle role : roles) {
            habilitations = mapping_role_habilitations.get(role);
            if (habilitations.contains(Habilitation.ECRITURE)) {
                permissionGranted = true;
            }
        }
        if (permissionGranted) {
            this.historiques.add(message);
        } else {
            throw new ActionNonAutoriseeException();
        }
    }

    public Map<Rôle, List<Utilisateur>> getMapping_role_utilisateurs() {
        return mapping_role_utilisateurs;
    }

    public void setMapping_role_utilisateurs(Map<Rôle, List<Utilisateur>> mapping_role_utilisateurs) {
        this.mapping_role_utilisateurs = mapping_role_utilisateurs;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public List<Webhook> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(List<Webhook> webhooks) {
        this.webhooks = webhooks;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Map<Rôle, List<Habilitation>> getMapping_role_habilitations() {
        return mapping_role_habilitations;
    }

    public void setMapping_role_habilitations(Map<Rôle, List<Habilitation>> mapping_role_habilitations) {
        this.mapping_role_habilitations = mapping_role_habilitations;
    }

    public List<Message> getHistoriques() {
        return historiques;
    }

    public void setHistoriques(List<Message> historiques) {
        this.historiques = historiques;
    }

    @Override
    public int compareTo(Canal o) {
        return this.ordre - o.ordre;
    }
}
