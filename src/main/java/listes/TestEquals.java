package listes;

import listes.entites.Ville;

public class TestEquals {
    public static void main(String[] args) {
        Ville ville1 = new Ville(900_000, "Paris");
        Ville ville2 = new Ville(900_000, "Paris");
        Ville ville3 = new Ville(900_000, "Marseille");

        String str = "Ceci n'est pas une ville";

        System.out.println(ville1.equals(ville2));      // true
        System.out.println(ville1.equals(ville3));      // false
        System.out.println(ville1.equals(str));         // false

        System.out.println();
        System.out.println(ville1 == ville2);           // false
        System.out.println(ville1 == ville3);           // false
    }
}
