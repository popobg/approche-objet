package fr.diginamic.salaire;

public abstract class Intervenant {
    protected String nom;
    protected String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract String getStatut();

    public abstract double getSalaire();

    public void afficherDonnees() {
        System.out.printf("Nom : %s, prénom : %s, salaire : %s, statut : %s%n", this.nom, this.prenom, this.getSalaire(), this.getStatut());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
