package maps;

import listes.entites.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        // Récupération des données du tp 10 : liste
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

        HashMap<String, Ville> mapVilles = new HashMap<>();

        // Créer la map à partir des données de la liste
        for (Ville ville : listeVilles) {
            mapVilles.put(ville.getNom(), ville);
        }

        // Supprimer la ville qui présente le moins d'habitants
        Ville villeLaMoinsPeuplee = null;
        for (Ville ville : mapVilles.values()) {
            if (villeLaMoinsPeuplee == null || ville.getNbHabitants() < villeLaMoinsPeuplee.getNbHabitants()) {
                villeLaMoinsPeuplee = ville;
            }
        }

        mapVilles.remove(villeLaMoinsPeuplee.getNom());

        for (String nom: mapVilles.keySet()) {
            System.out.println("Clé : " + nom);
            System.out.println("Valeur : " + mapVilles.get(nom));
            System.out.println();
        }
    }
}
