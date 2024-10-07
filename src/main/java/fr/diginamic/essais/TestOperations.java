package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double firstNumber = 9.5;
        double secondNumber = 7.8;

        System.out.println(firstNumber + " + " + secondNumber + " = " + Operations.calcul(firstNumber, secondNumber, '+'));
        System.out.println(firstNumber + " - " + secondNumber + " = " + Operations.calcul(firstNumber, secondNumber, '-'));
        System.out.println(firstNumber + " * " + secondNumber + " = " + Operations.calcul(firstNumber, secondNumber, '*'));
        System.out.println(firstNumber + " / " + secondNumber + " = " + Operations.calcul(firstNumber, secondNumber, '/'));
        System.out.println("Test mauvais opérateur : " + Operations.calcul(firstNumber, secondNumber, 'u'));
    }
}
