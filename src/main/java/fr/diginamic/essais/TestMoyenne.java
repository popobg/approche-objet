package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne calculateurMoyenne = new CalculMoyenne();
        System.out.println("Moyenne du tableau vide : " + calculateurMoyenne.moyenneTableau());

        calculateurMoyenne.ajoutNombre(32.5);

        double[] tableauNombres = calculateurMoyenne.getTableau();
        afficherTableau(tableauNombres);

        calculateurMoyenne.ajoutNombre(13);
        calculateurMoyenne.ajoutNombre(-5);

        tableauNombres = calculateurMoyenne.getTableau();
        afficherTableau(tableauNombres);

        System.out.println("Moyenne du tableau avant ajout de 8 : " + calculateurMoyenne.moyenneTableau());

        calculateurMoyenne.ajoutNombre(80);

        System.out.println("Moyenne du tableau après ajout de 8 : " + calculateurMoyenne.moyenneTableau());
    }

    /**
     * Fonction statique permettant d'afficher les éléments d'un tableau
     * dans la console.
     * @param tableau tableau de nombres décimaux
     */
    public static void afficherTableau(double[] tableau) {
        System.out.print("Les nombres du tableau sont : ");
        for (double nombre : tableau) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }
}
