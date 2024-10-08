package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Théâtre du Grand Rond", 3, 50, 25.5);

        System.out.println("Nombre de clients inscrits : " + theatre.getNbClientsInscrits());
        System.out.println();

        // print true si on a pu inscrire tous les clients donnés
        // en paramètres à la méthode
        System.out.println("Tous les clients ont été inscrits : " + theatre.InscrireClients(10, 8.5));
        System.out.println("Tous les clients ont été inscrits : " + theatre.InscrireClients(10, 8.5));
        System.out.println("Tous les clients ont été inscrits : " + theatre.InscrireClients(10, 8.5));
        System.out.println("Tous les clients ont été inscrits : " + theatre.InscrireClients(10, 8.5));
        System.out.println("Tous les clients ont été inscrits : " + theatre.InscrireClients(10, 8.5));

        System.out.println();
        System.out.println("Nombre de clients inscrits : " + theatre.getNbClientsInscrits());
        System.out.println("Recette totale: " + theatre.getRecetteTotale());
    }
}
