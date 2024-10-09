package listes;

import java.util.*;

public class TestListeString {
    public static void main(String[] args) {
        List<String> villes = new ArrayList<String>();
        Collections.addAll(villes, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

        // réalisable également avec une boucle et deux variables (lettresMax
        // et plusLongueVille).
        // La méthode suivante compare chaque élément sur la base de leur taille
        // et retourne le plus long.
        // String::length == e -> e.length()
        String plusLongueVille = Collections.max(villes, Comparator.comparing(String::length));
        System.out.println("La ville la plus longue de la liste est " + plusLongueVille);

        // identique à une boucle qui applique l'instruction à chaque élément.
        // On peut aussi écrire ville.replaceAll(String::toUpperCase)
        villes.replaceAll(ville -> ville.toUpperCase());

        Iterator<String> iteratorVilles = villes.iterator();

        while(iteratorVilles.hasNext()) {
            String ville = iteratorVilles.next();

            if (ville.charAt(0) != 'N') {
                iteratorVilles.remove();
            }
        }

        System.out.print("Les villes commençant par 'N' dans la liste sont : ");
        for (String ville : villes) {
            System.out.print(ville + " ");
        }
    }
}
