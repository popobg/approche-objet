package fr.diginamic.operations;

public class Operations {
    /**
     * Fonction statique permettant d'effectuer les quatres opérations
     * élémentaires (addition, soustraction, multiplication, division)
     * sur deux nombres décimaux.
     * @param a premier nombre décimal de l'opération
     * @param b deuxième nombre décimal de l'opération
     * @param operateur caractère représentant l'opérateur (+, -, *, /)
     * @return un nombre décimal, résultat de l'opération, ou 0 si l'opérateur n'est pas reconnu
     */
    public static double calcul(double a, double b, char operateur) {
        if (operateur == '+') {
            return a + b;
        }
        else if (operateur == '-') {
            return a - b;
        }
        else if (operateur == '*') {
            return a * b;
        }
        else if (operateur == '/') {
            return a / b;
        }
        else {
            return 0;
        }
    }
}
