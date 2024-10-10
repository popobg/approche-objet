package sets;

import sets.entites.Pays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class TestSetPays {
    public static void main(String[] args) {
        HashSet<Pays> setPays = new HashSet<>();
        Collections.addAll(setPays,
                new Pays("USA", 333_300_000, 76_329.6),
                new Pays("France", 68_000_000, 46_125.3),
                new Pays("Allemagne", 83_000_000, 48_718),
                new Pays("UK",  67_000_000, 46_125.3),
                new Pays("Italie", 59_000_000, 40_886.3),
                new Pays("Japon", 125_000_000, 33_823.6),
                new Pays("Chine", 1_412_000_000, 12_270.2),
                new Pays("Russie", 144_000_000, 15_270.7),
                new Pays("Inde", 1_417_000_000, 2_410.9));

        // Chercher le pays dont le PIB/hab est le plus élevé
        Pays paysMaxPIBHab = Collections.max(setPays, Comparator.comparing(Pays::getPIBHabitants));
        System.out.println("Le pays au PIB/habitants le plus important est : " + paysMaxPIBHab.getNom());

        // Chercher le pays dont le PIB total est le plus élevé
        Pays paysMaxPIBTot = Collections.max(setPays, Comparator.comparing(Pays::calculerPIBTotal));
        System.out.println("Le pays au PIB total le plus important est : " + paysMaxPIBTot);

        // Mettre en majuscule le nom du pays dont le PIB total est le plus faible
        Pays paysMinPIBTot = Collections.min(setPays, Comparator.comparing(Pays::calculerPIBTotal));
        paysMinPIBTot.setNom(paysMinPIBTot.getNom().toUpperCase());

        // Supprimer du set le pays dont le PIB total est le plus faible ;
        // Cela supprime donc l'élément qui a été mis en majuscule précédemment.
        setPays.remove(paysMinPIBTot);

        System.out.println("Voici les éléments qui composent le set en sortie : ");
        setPays.forEach(System.out::println);
    }
}
