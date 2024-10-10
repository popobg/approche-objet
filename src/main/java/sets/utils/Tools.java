package sets.utils;

import java.util.Collection;

public class Tools {
    /**
     * Affiche dans la console le message donné
     * suivi des nombres décimaux de type Double
     * contenus dans un conteneur de type Collection.
     * @param nombres   collection de nombres de type Double
     * @param message   message introductif à afficher dans la console
     *                  avant l'affichage des nombres
     */
    public static void afficherCollectionDouble(Collection<Double> nombres, String message) {
        System.out.print(message);
        nombres.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    /**
     * Affiche dans la console le message donné
     * suivi des chaînes de caractères contenues
     * dans un conteneur de type Collection.
     * @param collStr   collection de String
     * @param message   message introductif à afficher dans la console
     *                  avant l'affichage des chaînes de caractères
     */
    public static void afficherCollectionString(Collection<String> collStr, String message) {
        System.out.print(message);
        collStr.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
