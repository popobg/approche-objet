package listes;

import java.util.ArrayList;
import java.util.Collections;

public class FusionListe {
    public static void main(String[] args) {
        ArrayList<String> liste1 = new ArrayList<>();
        Collections.addAll(liste1, "Rouge", "Vert", "Orange");

        ArrayList<String> liste2 = new ArrayList<>();
        Collections.addAll(liste1, "Blanc", "Bleu", "Orange");

        ArrayList<String> liste3 = new ArrayList<>();

        // On peut aussi utiliser addAll
        for (String couleur : liste1) {
            liste3.add(couleur);
        }

        for (String couleur : liste2) {
            liste3.add(couleur);
        }
    }
}
