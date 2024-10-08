package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel; 2 523.5";

        // 1) Afficher le premier caractère de la chaîne
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère : " + premierCaractere);

        // 2) Afficher la longueur de la chaîne
        System.out.println("Longueur de la chaîne de caractères : " + chaine.length());

        // 3) Première apparition du caractère ';' dans la chaîne
        System.out.println("Première apparition du caractère ';' dans la chaîne : " + chaine.indexOf(';'));

        // 4) Extraire le nom de famille de la chaîne
        String nomDeFamille = chaine.substring(0, chaine.indexOf(';'));
        System.out.println("Le nom de famille est : " + nomDeFamille);
        // 5) Afficher le nom de famille en majuscules
        System.out.println("Le nom de famille en majuscules est : " + nomDeFamille.toUpperCase());
        // 6) Afficher le nom de famille en minuscules
        System.out.println("Le nom de famille en minuscules est : " + nomDeFamille.toLowerCase());

        // 7) Découper la chaîne, séparateur = ";"
        String[] splittedChaine = chaine.split(";");

        System.out.print("Les éléments du tableau sont : ");
        for (int i = 0; i < splittedChaine.length; i++) {
            // Retirer les espaces en début et fin de chaîne de caractères
            splittedChaine[i] = splittedChaine[i].trim();
            System.out.print(splittedChaine[i] + " ");
        }
        System.out.println();

        double salaire = Double.parseDouble(splittedChaine[splittedChaine.length  - 1].replace(" ", ""));

        // 8-9) Création d'une classe Salarie et instanciation de celle-ci
        Salarie salarie = new Salarie(splittedChaine[0], splittedChaine[1], salaire);
        System.out.println(salarie);
    }
}
