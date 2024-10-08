package fr.diginamic.jdr.Tools;

import fr.diginamic.jdr.entites.Creature;
import fr.diginamic.jdr.entites.Gobelin;
import fr.diginamic.jdr.entites.Loup;
import fr.diginamic.jdr.entites.Troll;

import java.util.Random;

public class GenerationAleatoire {
    /**
     * Retourne un nombre aléatoire dans un certain intervalle de
     * valeurs.
     * donné en paramètre.
     * @param min borne inférieure (incluse)
     * @param max borne supérieure (incluse)
     * @return un nombre entier généré aléatoirement appartenant à l'intervalle donné
     */
    public static int genererNombreAleatoire(int min, int max) {
        Random random = new Random();
        // nextInt retourne un entier entre 0 et le nombre précédent
        // celui donné en paramètre (exclusif) : résultats possibles = [0, n-1].
        return random.nextInt((max + 1) - min) + min;
    }

    /**
     * Retourne un objet aléatoire héritant du type Creature,
     * instancié avec des valeurs de force et pv aléatoires.
     * @return un objet Loup, Gobelin ou Troll (héritent de Creature)
     */
    public static Creature genererEnnemiAleatoire() {
        int random = genererNombreAleatoire(1, 3);

        return switch (random) {
            case 1 -> new Loup(genererNombreAleatoire(12, 18), genererNombreAleatoire(5, 10));
            case 2 -> new Gobelin(genererNombreAleatoire(5, 10), genererNombreAleatoire(10, 15));
            default -> new Troll(genererNombreAleatoire(10, 15), genererNombreAleatoire(20, 30));
        };
    }
}
