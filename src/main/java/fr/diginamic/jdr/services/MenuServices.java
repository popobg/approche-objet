package fr.diginamic.jdr.services;

import fr.diginamic.jdr.entites.Combattant;
import fr.diginamic.jdr.entites.Creature;
import fr.diginamic.jdr.entites.Personnage;

public class MenuServices {
    public static void afficherIntroduction() {
        System.out.println();
        System.out.println("Bienvenue dans CRATAC, preux aventurier !");
        System.out.println("Êtes-vous là pour la chasse au monstre qui se déroule actuellement au royaume ?");
    }

    public static void afficherMenuPrincipal(String nom) {
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Messire " + nom + " ! Je nous vous avais pas reconnu.");
        System.out.println("Qu'allons-nous faire aujourd'hui ?");
        System.out.println();
        System.out.println("1. Lancer un combat !");
        System.out.println("2. Afficher mon score.");
        System.out.println("3. Afficher mon nombre actuel de points de santé (PV).");
        System.out.println("4. Boire une potion (+5 PV).");
        System.out.println("5. Quitter le jeu.");
        System.out.println("---------------------------------------");
        System.out.println();
    }

    public static void afficherScore(Personnage personnage) {
        System.out.printf("%s, vous avez actuellement un score de %s !", personnage.getName(), personnage.getScore());
        System.out.println();
    }

    public static void afficherPV(Personnage personnage) {
        System.out.printf("%s, vous avez actuellement %s %s de santé sur %s.", personnage.getName(), personnage.getPV(), pointOuPoints(personnage.getPV()), personnage.getPV_MAX());
        System.out.println();
    }

    public static void afficherBoirePotion(Personnage personnage) {
        System.out.println("Une petite potion et ça repart !");
        afficherPV(personnage);
    }

    public static void afficherEgalite(Personnage perso, Creature creature) {
        System.out.printf("Le %s attaque violemment %s. %s pare avec brio. Vous vous en sortez tous les deux sans dégâts.%n", creature.getName(), perso.getName(), perso.getName());
        System.out.println();
    }

    public static void afficherIssueCombat(Combattant combattant1, Combattant combattant2, int degats) {
        String nom1;
        String nom2;
        String conj;

        if (combattant1 instanceof Personnage) {
            nom1 = combattant1.getName();
            conj = "au " + combattant2.getName();
            nom2 = "Le " + combattant2.getName();
        }
        else {
            nom1 = "Le " + combattant1.getName();
            conj = "à " + combattant2.getName();
            nom2 = combattant2.getName();
        }

        if (degats >= 7) {
            System.out.printf("%s assène une attaque puissante %s. %s prend %s %s de dégâts dans la tronche.%n", nom1, conj, nom2, degats, pointOuPoints(degats));
        }
        else {
            System.out.printf("%s assène un coup vif %s. %s prend %s %s de dégâts dans la tronche.%n", nom1, conj, nom2, degats, pointOuPoints(degats));
        }
    }

    public static void afficherEtat(Personnage perso, Creature creature) {
        System.out.printf("Le %s a actuellement %s %s de vie, vous en avez %s.%n", creature.getName(), creature.getPV(), pointOuPoints(creature.getPV()), perso.getPV());
        System.out.println();
    }

    public static void afficherMort(Personnage perso, Creature creature) {
        System.out.printf("%s, vous avez succombé face au %s...%n", perso.getName(), creature.getName());
        if (creature.getPV() < 5) {
            System.out.println("La créature tombe sur le flanc, à bout de force après ce combat titanesque.");
        }
        System.out.println();
    }

    public static void afficherVictoire(Personnage perso, Creature creature) {
        System.out.printf("%s, vous avez terrassé le %s. Félicitations !%n", perso.getName(), creature.getName());
        System.out.println();
    }

    public static void afficherMessageFin(Personnage personnage) {
        if (personnage.getScore() == 0
                && personnage.getPV() == personnage.getPV_MAX()) {
            System.out.println("\"Revenez quand vous vous sentirez d'attaque messire.\"");
            return;
        }

        if (personnage.getPV() == 0) {
            System.out.println(personnage.getName() + ", vous avez perdu, mais vous avez combattu vaillamment.");
            if (personnage.getScore() > 3) {
                System.out.println("Vos exploits seront longtemps chantés.");
            }
        }
        else if (personnage.getPV() < 7) {
            System.out.println(personnage.getName() + ", il est effectivement plus sage d'aller vous reposer.");
            System.out.println("Revenez-nous quand vous serez rasséréné !");
        }
        else {
            System.out.println(personnage.getName() + ", vous vous êtes bien battu.");
            System.out.println("Nous espérons vous revoir bientôt pour accomplir des prouesses.");
        }

        System.out.println("Vous partez avec un score de " + personnage.getScore() + ".");
    }

    private static String pointOuPoints(int PV) {
        return PV > 1 ? "points" : "point";
    }
}
