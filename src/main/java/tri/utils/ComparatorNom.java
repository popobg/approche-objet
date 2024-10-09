package tri.utils;

import listes.entites.Ville;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {

    // Utilisation de la méthode compareTo implémentée dans
    // dans la classe String.
    public int compare(Ville ville1, Ville ville2) {
        return ville1.getNom().toLowerCase().compareTo(ville2.getNom().toLowerCase());
    }
}
