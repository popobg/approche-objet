package maps.entites;

public class Pays {
    private String nom;
    private int nbHabitants;
    private String continent;

    public Pays(String nom, String continent, int nbHabitants) {
        this.nom = nom;
        this.continent = continent;
        this.nbHabitants = nbHabitants;
    }

    public String getContinent() {
        return continent;
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
}
