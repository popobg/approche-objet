package entites;

// rend accessible la classe Personne dans cette classe
import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        // constructeur à 3 paramètres
        Personne personne1 = new Personne(
                "Monkey D.",
                "Luffy",
                new AdressePostale((short)3, "Avenue du maréchal Foch", 65000, "Tarbes")
        );

        // constructeur à 2 paramètres
        Personne personne2 = new Personne("Uzumaki", "Naruto");
        AdressePostale adressePersonne2 = new AdressePostale((short)8, "Rue du chapiteau", 86000, "Poitiers");
        personne2.adresse = adressePersonne2;

        // accès aux attributs
        System.out.println(personne1.nom + " " + personne1.prenom);
        System.out.println(personne2.nom + " " + personne2.prenom);
    }
}
