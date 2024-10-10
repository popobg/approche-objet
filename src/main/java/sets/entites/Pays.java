package sets.entites;

public class Pays {
    private String nom;
    private int nbHabitants;
    private double PIBHabitants;

    public Pays(String nom, int nbHabitants, double PIBHabitants) {
        this.nbHabitants = nbHabitants;
        this.nom = nom;
        this.PIBHabitants = PIBHabitants;
    }

    public double calculerPIBTotal() {
        return this.PIBHabitants * this.nbHabitants;
    }

    @Override
    public String toString() {

        return String.format("%s : nombres d'habitants = %o, PIB total = %.0f USD.", this.nom, this.nbHabitants, this.calculerPIBTotal());
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

    public double getPIBHabitants() {
        return PIBHabitants;
    }

    public void setPIBHabitants(double PIBHabitants) {
        this.PIBHabitants = PIBHabitants;
    }
}
