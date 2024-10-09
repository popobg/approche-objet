package tri.utils;

import listes.entites.Ville;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    // Ordre décroissant de densité de population
    public int compare (Ville ville1, Ville ville2) {
        if (ville1.getNbHabitants() > ville2.getNbHabitants()) {
            return -1;
        }
        else if (ville1.getNbHabitants() < ville2.getNbHabitants()) {
            return 1;
        }
        return 0;
    }
}
