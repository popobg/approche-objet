package fr.diginamic.banque;

import java.util.Arrays;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compteCourant = new Compte("102351A38847", 102.35);
        CompteTaux compteTaux = new CompteTaux("231745DE1012", 1050, 3);

        Compte[] comptes = { compteCourant, compteTaux };

        System.out.println();
        // print le tableau
        System.out.println(Arrays.toString(comptes));

        System.out.println();
        // print chaque élément du tableau
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
