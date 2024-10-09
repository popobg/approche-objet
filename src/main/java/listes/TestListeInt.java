package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> listeNombres = new ArrayList<Integer>();
        Collections.addAll(listeNombres, -1, 5, 7, 3, -2, 4, 8, 5);

        afficherListNombre(listeNombres, "Les éléments de la liste sont les suivants : ");

        System.out.println("La taille de la liste est de " + listeNombres.size());

        // On pourrait aussi y parvenir avec une variable max et une boucle
        System.out.println("Le plus grand élément de la liste est " + Collections.max(listeNombres));

        // En utilisant les méthodes disponibles avec les objets Collections
        Integer min = Collections.min(listeNombres);
        // Supprime la première occurence de l'objet donné trouvée dans la liste
        listeNombres.remove(min);

        afficherListNombre(listeNombres, "Après suppression du minimum, les éléments de la liste sont les suivants : ");

        for (int i = 0; i < listeNombres.size(); i++) {
            if (listeNombres.get(i) < 0) {
                listeNombres.set(i, Math.abs(listeNombres.get(i)));
            }
        }

        afficherListNombre(listeNombres, "Après modification des éléments négatifs, les éléments de la liste sont les suivants : ");
    }

    public static void afficherListNombre(List<Integer> list, String message) {
        System.out.print(message);
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
