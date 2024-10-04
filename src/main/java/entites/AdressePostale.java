package entites;

public class AdressePostale {
    short numeroRue;
    String libelleRue;
    int codePostal;
    String ville;

    // avec l'IDE, on peut faire clic droit -> Generate -> Constructor
    public AdressePostale(
            short numeroRue,
            String libelleRue,
            int codePostal,
            String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumeroDepartement() {
        // division entière car on manipule un type int (et non un type décimal)
        return this.codePostal / 1000;
    }
}
