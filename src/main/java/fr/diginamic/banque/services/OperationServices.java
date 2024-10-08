package fr.diginamic.banque.services;

import fr.diginamic.banque.entites.Operation;

public class OperationServices {
    public static double calculTotal(Operation[] operations) {
        double somme = 0;

        for (Operation ope : operations) {
            // éviter le == pour les objets, utiliser equals
            if(ope.getType().equals("CREDIT")) {
                somme += ope.getMontant();
            }
            else {
                somme -= ope.getMontant();
            }
        }

        return somme;
    }
}
