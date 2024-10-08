package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        Cuisine cuisine = new Cuisine((short)0, 10);
        Salon salon = new Salon((short)0, 12);
        Chambre chambre1 = new Chambre((short)1, 9);
        Chambre chambre2 = new Chambre((short)2, 15);
        SalleDeBain salleDeBain1 = new SalleDeBain((short)1, 5);
        SalleDeBain salleDeBain2 = new SalleDeBain((short)0, 4);
        WC wc = new WC((short)0, 3);

        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(salleDeBain1);
        maison.ajouterPiece(salleDeBain2);
        maison.ajouterPiece(wc);
        // Non pris en compte par la fonction,
        // pas de données null ajoutées au tableau
        maison.ajouterPiece(null);

        System.out.println("La superficie totale de la maison est de " + maison.calculerSuperficieTotale() + "m².");
        System.out.println("La superficie de l'étage 0 est de " + maison.calculerSuperficieEtage((short)0) + "m².");

        System.out.println("Il y a " + maison.calculerNombrePiecesParType("salle de bain") + " salle(s) de bain dans la maison.");
        System.out.println("Il y a " + maison.calculerNombrePiecesParType("CHAMBRE") + " chambre(s) dans la maison.");
        System.out.println("La superficie occupée par les chambres dans la maison est de " + maison.calculerSuperficieParTypePiece("chambre") + "m².");
    }
}
