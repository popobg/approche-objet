package entites2;

import entites.AdressePostale;

public class Personne {
    // Ajout du mot-clé "public" pour rendre ces attributs accessibles
    // à partir d'une classe appartenant à un autre package
    public String nom;
    public String prenom;
    public AdressePostale adresse;

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
}
