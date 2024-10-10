package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(69, "Lyon");
        mapVilles.put(59, "Lille");
        mapVilles.put(33, "Bordeaux");

        for (Integer departement: mapVilles.keySet()) {
            System.out.println("La clé, soit le numéro de département, est : " + departement);
            System.out.println("La valeur, soit la préfecture associée, est : " + mapVilles.get(departement));
            System.out.println();
        }

        System.out.println("Taille de la map : " + mapVilles.size());
    }
}
