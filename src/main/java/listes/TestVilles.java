package listes;

import listes.entites.Ville;
import tri.utils.ComparatorHabitant;
import tri.utils.ComparatorNom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestVilles {
    public static void main(String[] args) {
        List<Ville> listeVilles = new ArrayList<>();
        Collections.addAll(listeVilles,
                new Ville(343000, "Nice"),
                new Ville(47800, "Carcassonne"),
                new Ville(53400, "Narbonne"),
                new Ville(484000, "Lyon"),
                new Ville(9700, "Foix"),
                new Ville(77200, "Pau"),
                new Ville(850700, "Marseille"),
                new Ville(40600, "Tarbes"));

        // Deux types d'écriture de la lambda différentes
        Ville villePlusPeuplee = Collections.max(listeVilles, Comparator.comparingInt(v -> v.getNbHabitants()));
        System.out.println("Ville la plus peuplée : " + villePlusPeuplee);

        Ville villeMoinsPeuplée = Collections.min(listeVilles, Comparator.comparingInt(Ville::getNbHabitants));
        System.out.println("Ville la moins peuplée : " + villeMoinsPeuplée);
        listeVilles.remove(villeMoinsPeuplée);

        for (Ville v : listeVilles) {
            if (v.getNbHabitants() > 100000) {
                v.setNom(v.getNom().toUpperCase());
            }
        }
        System.out.println();

        // Utilisation de classes implémentant utilisant Comparator
        Collections.sort(listeVilles, new ComparatorHabitant());
        System.out.println("Voici les villes triées par ordre décroissant de densité de population :");
        listeVilles.forEach(System.out::println);

        System.out.println("\n");

        Collections.sort(listeVilles, new ComparatorNom());
        System.out.println("Voici les villes triées par ordre alphabétique :");
        listeVilles.forEach(System.out::println);
    }
}
