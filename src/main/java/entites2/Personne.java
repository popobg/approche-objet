package entites2;

import entites.AdressePostale;

public class Personne {
    // Ajout du mot-clé "public" pour rendre ces attributs accessibles
    // à partir d'une classe appartenant à un autre package

    // VALEURS D'ATTRIBUTS
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // CONSTRUCTEURS
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = new AdressePostale((short)34, "rue du loup", 75000, "Paris");
    }

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public void afficherNomPrenom() {
        System.out.println(this.prenom + " " + this.nom.toUpperCase());
    }

    // SETTERS
    public void setNom(String newNom) {
        this.nom = newNom;
    }

    public void setPrenom(String newPrenom) {
        this.prenom = newPrenom;
    }

    public void setAdresse(AdressePostale newAdresse) {
        this.adresse = newAdresse;
    }

    // GETTERS
    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public AdressePostale getAdresse() {
        return this.adresse;
    }
}
