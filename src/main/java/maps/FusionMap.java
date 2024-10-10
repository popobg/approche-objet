package maps;

import java.util.HashMap;

public class FusionMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        HashMap<Integer, String> map3 = new HashMap<>(map1);

        for (Integer cle : map2.keySet()) {
            map3.put(cle, map2.get(cle));
        }

        // affichage du contenu de map3 dans la console
        System.out.println("Le contenu de map3 : ");
        for (Integer cle: map3.keySet()) {
            System.out.println(cle + ". " + map3.get(cle));
        }
    }
}
