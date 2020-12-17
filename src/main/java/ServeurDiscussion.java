import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServeurDiscussion {
    private Map<Rôle, List<Utilisateur>> mapping_role_utilisateur;
    private List<Canal> canaux;
    private String nom;
    private Map<Rôle, List<Habilitation>> mapping_role_habilitations;

    public ServeurDiscussion() {
    }

    public Map<Rôle, List<Utilisateur>> getMapping_role_utilisateur() {
        return mapping_role_utilisateur;
    }

    public void setMapping_role_utilisateur(Map<Rôle, List<Utilisateur>> mapping_role_utilisateur) {
        this.mapping_role_utilisateur = mapping_role_utilisateur;
    }

    public List<Canal> getCanaux() {
        return canaux;
    }

    public void setCanaux(List<Canal> canaux) {
        this.canaux = canaux;
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
}
