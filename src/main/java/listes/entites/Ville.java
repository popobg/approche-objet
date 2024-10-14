package listes.entites;

public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(int nbHabitants, String nom) {
        this.nbHabitants = nbHabitants;
        this.nom = nom;
    }

/*
    // critère de tri : nom de ville
    @Override
    public int compareTo(Ville autreVille) {
        return this.nom.toLowerCase().compareTo(autreVille.getNom().toLowerCase());
    }

    // critère de tri : nb d'habitants (décroissant)
    @Override
    public int compareTo(Ville autreVille) {
        if (this.nbHabitants > autreVille.getNbHabitants()) {
            return -1;
        }
        else if (this.nbHabitants < autreVille.getNbHabitants()) {
            return 1;
        }
        return 0;
    }
 */

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ville)) {
            return false;
        }

        Ville autreVille = (Ville)obj;

        return this.nom.equals(autreVille.getNom())
                && this.nbHabitants == autreVille.getNbHabitants();
    }

    @Override
    public String toString() {
        return nom + ", " +
                "nombre d'habitants = " + nbHabitants +
                ".";
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
