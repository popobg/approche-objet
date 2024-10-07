package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] tableauNombres = {};

    /**
     * Fonction permettant d'ajouter un nombre au tableau
     * de nombres décimaux.
     * @param nombre nombre à ajouter
     */
    public void ajoutNombre(double nombre) {
        this.tableauNombres = Arrays.copyOf(tableauNombres, tableauNombres.length + 1);
        this.tableauNombres[tableauNombres.length - 1] = nombre;
    }

    /**
     * Fonction permettant de calculer et de retourner
     * la moyenne du tableau de nombres décimaux.
     * @return nombre décimal, moyenne des nombres du tableau
     */
    public double moyenneTableau() {
        if (this.tableauNombres.length == 0) return 0;

        double sum = 0;

        for (double nombre : this.tableauNombres) {
            sum += nombre;
        }

        return sum / tableauNombres.length;
    }

    public double[] getTableau() {
        return tableauNombres;
    }
}
