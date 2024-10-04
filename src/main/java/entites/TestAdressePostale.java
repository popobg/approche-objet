package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 2;
        adresse1.libelleRue = "Rue du château";
        adresse1.codePostal = 31200;
        adresse1.ville = "Toulouse";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 130;
        adresse2.libelleRue = "Avenue du général De Gaulle";
        adresse2.codePostal = 78300;
        adresse2.ville = "Poissy";
    }
}
