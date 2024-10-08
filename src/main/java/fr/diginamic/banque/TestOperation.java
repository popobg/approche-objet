package fr.diginamic.banque;

import java.text.DecimalFormat;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.services.OperationServices;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = {
                new Credit("25/10/2024", 12.55),
                new Debit("13/08/2023", 80),
                new Credit("05/02/2024", 16.99),
                new Debit("02/06/2000", 2.5)
        };

        System.out.println();
        for (Operation ope : operations) {
            System.out.println(ope.getType());
            System.out.println(ope);
        }

        double somme = OperationServices.calculTotal(operations);

        // autorise 2 chiffres décimaux après la virgule
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        String prompt = somme > 0? "Votre solde est positif : " : "Votre solde est nul ou négatif : ";

        System.out.println();
        System.out.println(prompt + numberFormat.format(somme) + "€");
    }
}
