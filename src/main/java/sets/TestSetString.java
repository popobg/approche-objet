package sets;

import sets.utils.Tools;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> setPays = new HashSet<>();
        Collections.addAll(setPays, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");

        // String::length peut être remplacé par `pays -> pays.length()`
        String maxLettres = Collections.max(setPays, Comparator.comparing(String::length));
        setPays.remove(maxLettres);

        Tools.afficherCollectionString(setPays, "Voici les pays du set après suppression du pays au plus long nom : ");
    }
}
