package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte mon_compte = new Compte("102351A38847", 102.35);

        System.out.println(mon_compte);
    }
}
