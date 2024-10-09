package listes;

import listes.entites.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestVilles {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<Ville>();
        Collections.addAll(villes,
                new Ville(343000, "Nice"),
                new Ville(47800, "Carcassonne"),
                new Ville(53400, "Narbonne"),
                new Ville(484000, "Lyon"),
                new Ville(9700, "Foix"),
                new Ville(77200, "Pau"),
                new Ville(850700, "Marseille"),
                new Ville(40600, "Tarbes"));

        // Deux types d'écriture de la lambda différentes
        Ville villePlusPeuplée = Collections.max(villes, Comparator.comparingInt(v -> v.getNbHabitants()));
        System.out.println("Ville la plus peuplée : " + villePlusPeuplée);

        Ville villeMoinsPeuplée = Collections.min(villes, Comparator.comparingInt(Ville::getNbHabitants));
        System.out.println("Ville la moins peuplée : " + villeMoinsPeuplée);
        villes.remove(villeMoinsPeuplée);

        for (Ville v : villes) {
            if (v.getNbHabitants() > 100000) {
                v.setNom(v.getNom().toUpperCase());
            }
        }

        System.out.println();
        villes.forEach(System.out::println);
    }
}
