public class Main {
    public static void main(String[] args) {
        ServeurDiscussion serveur = new ServeurDiscussion();
        Canal canal = new Canal();
        Rôle role = new Rôle("Admin");
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setPrenom("Anthony");
        utilisateur.setNom("Pauthonnier");
        serveur.setNom("DiscordServeur1");
        canal.setNom("canal1");
//        serveur.ajouterRôle(role);
//        serveur.ajouterUtilisateurDansRôle(role, utilisateur);

//        serveur.getMapping_role_utilisateur().toString();

    }
}
