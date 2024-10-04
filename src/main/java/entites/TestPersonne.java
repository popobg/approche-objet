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
        personne2.setAdresse(new AdressePostale((short)8, "Rue du chapiteau", 86000, "Poitiers"));

        personne1.afficherNomPrenom();
        personne2.afficherNomPrenom();

        personne1.setPrenom("Ace");
        personne1.setNom("Portgas D.");

        // accès aux attributs
        System.out.println(personne1.getNom() + " " + personne1.getPrenom());
    }
}
