package listes.entites;

public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(int nbHabitants, String nom) {
        this.nbHabitants = nbHabitants;
        this.nom = nom;
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
