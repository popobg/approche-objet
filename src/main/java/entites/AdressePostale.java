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
}
