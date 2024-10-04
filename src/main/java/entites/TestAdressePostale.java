package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale((short)2, "Rue du château", 31200, "Toulouse");
        AdressePostale adresse2 = new AdressePostale((short)130, "Avenue du général De Gaulle", 78300, "Poissy");

        // call toString()
        System.out.println(adresse1);
        System.out.println(adresse1.getNumeroDepartement());
        System.out.println(adresse2.getNumeroDepartement());
    }
}
