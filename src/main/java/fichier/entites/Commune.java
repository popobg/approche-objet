package fichier.entites;

public class Commune {
    private String nom;
    // car la Corse = 2A
    private String codeDepartement;
    private String region;
    private int popTotale;

    public Commune(String codeDepartement, String nom, int popTotale, String region) {
        this.codeDepartement = codeDepartement;
        this.nom = nom;
        this.popTotale = popTotale;
        this.region = region;
    }

    @Override
    public String toString() {
        return nom + ";" + codeDepartement + ";" + region + ';' + popTotale + ";";
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPopTotale() {
        return popTotale;
    }

    public void setPopTotale(int popTotale) {
        this.popTotale = popTotale;
    }

    public String getRegion() {
        return region;
    }
}
