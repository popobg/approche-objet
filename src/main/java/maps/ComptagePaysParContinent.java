package maps;

import maps.entites.Pays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        List<Pays> listePays = new ArrayList<>();
        Collections.addAll(listePays,
                new Pays("France", "Europe", 65_000_000),
                new Pays("Allemagne", "Europe", 80_000_000),
                new Pays("Belgique", "Europe", 10_000_000),
                new Pays("Russie", "Europe", 150_000_000),
                new Pays("Chine", "Asie", 1_400_000_000),
                new Pays("Indonésie", "Océanie", 220_000_000),
                new Pays("Australie", "Océanie", 20_000_000));

        HashMap<String, Integer> mapContinent = new HashMap<>();

        for (Pays pays : listePays) {
            if (mapContinent.containsKey(pays.getContinent())) {
                mapContinent.put(pays.getContinent(), mapContinent.get(pays.getContinent()) + 1);
            }
            else {
                mapContinent.put(pays.getContinent(), 1);
            }
        }

        System.out.println("Le nombre de pays par continent est : ");
        for (String continent: mapContinent.keySet()) {
            System.out.println("Clé : " + continent);
            System.out.println("Valeur : " + mapContinent.get(continent));
            System.out.println();
        }
    }
}
