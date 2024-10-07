package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double premierNombre = 9.5;
        double secondNombre = 7.8;

        System.out.println(premierNombre + " + " + secondNombre + " = " + Operations.calcul(premierNombre, secondNombre, '+'));
        System.out.println(premierNombre + " - " + secondNombre + " = " + Operations.calcul(premierNombre, secondNombre, '-'));
        System.out.println(premierNombre + " * " + secondNombre + " = " + Operations.calcul(premierNombre, secondNombre, '*'));
        System.out.println(premierNombre + " / " + secondNombre + " = " + Operations.calcul(premierNombre, secondNombre, '/'));
        System.out.println("Test mauvais opérateur : " + Operations.calcul(premierNombre, secondNombre, 'u'));
    }
}
