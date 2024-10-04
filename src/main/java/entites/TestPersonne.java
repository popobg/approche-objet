package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        // C'est très long. Ce serait mieux avec un constructeur ;-)

        /*
        J'ai détaillé ici deux façons d'initialiser l'attribut AdressePostale :
        L'une à l'aide d'une instance d'AdressePostale existante, l'autre instanciée au moment
        de l'attribution de l'attribut adresse au sein de l'instance de Personne.
         */
        Personne personne1 = new Personne();
        personne1.nom = "Monkey D.";
        personne1.prenom = "Luffy";
        personne1.adresse = new AdressePostale();
        personne1.adresse.numeroRue = 3;
        personne1.adresse.libelleRue = "Avenue du maréchal Foch";
        personne1.adresse.codePostal = 65000;
        personne1.adresse.ville = "Tarbes";

        // Instanciation d'une nouvelle AdressePostale
        AdressePostale adressePersonne2 = new AdressePostale();
        adressePersonne2.numeroRue = 8;
        adressePersonne2.libelleRue = "Rue du chapiteau";
        adressePersonne2.codePostal = 86000;
        adressePersonne2.ville = "Poitiers";

        Personne personne2 = new Personne();
        personne2.nom = "Monkey D.";
        personne2.prenom = "Luffy";
        personne2.adresse = adressePersonne2;
        System.out.println(personne2.nom + " " + personne2.prenom);
    }
}
