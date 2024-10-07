package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compteCourant = new Compte("102351A38847", 102.35);
        CompteTaux compteTaux = new CompteTaux("231745DE1012", 1050, 3);

        Compte[] comptes = { compteCourant, compteTaux };

        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
