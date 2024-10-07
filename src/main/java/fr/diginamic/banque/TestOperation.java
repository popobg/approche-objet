package fr.diginamic.banque;

import java.text.DecimalFormat;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = {
                new Credit("25/10/2024", 12.55),
                new Debit("13/08/2023", 80),
                new Credit("05/02/2024", 16.99),
                new Debit("02/06/2000", 2.5)
        };

        double sum = 0;

        System.out.println();
        for (Operation ope : operations) {
            System.out.println(ope.getType());
            System.out.println(ope);

            if(ope.getType() == "CREDIT") {
                sum += ope.getMontantOperation();
            }
            else {
                sum -= ope.getMontantOperation();
            }
        }

        // autorise 2 chiffres décimaux après la virgule
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        String prompt = sum > 0? "Votre solde est positif : " : "Votre solde est nul ou négatif : ";

        System.out.println();
        System.out.println(prompt + numberFormat.format(sum));
    }
}
