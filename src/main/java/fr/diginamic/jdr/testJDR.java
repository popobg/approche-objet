package fr.diginamic.jdr;

import fr.diginamic.jdr.tools.GenerationAleatoire;
import fr.diginamic.jdr.tools.InputTools;
import fr.diginamic.jdr.tools.Wait;
import fr.diginamic.jdr.entites.Creature;
import fr.diginamic.jdr.entites.Personnage;
import fr.diginamic.jdr.services.CombatServices;
import fr.diginamic.jdr.services.MenuServices;

public class testJDR {
    public static void main(String[] args) {
        boolean continuerJeu = true;
        MenuServices.afficherIntroduction();

        // CREATION PERSONNAGE
        String nomPerso = InputTools.getStringInput("Avant toute chose, veuillez décliner votre nom :");
        int force = GenerationAleatoire.genererNombreAleatoire(12, 18);
        int PV = GenerationAleatoire.genererNombreAleatoire(20, 50);

        Personnage personnage = new Personnage(force, nomPerso, PV);

        System.out.println(personnage);
        Wait.attendre(3);

        while (continuerJeu) {
            MenuServices.afficherMenuPrincipal(nomPerso);
            int choixJoueur = InputTools.getIntInput(1, 5);

            switch (choixJoueur) {
                case 1:
                    Creature creature = GenerationAleatoire.genererEnnemiAleatoire();
                    // return true si le joueur est victorieux
                    // return false si le joueur est mort
                    continuerJeu = CombatServices.lancerCombat(personnage, creature);
                    break;
                case 2:
                    MenuServices.afficherScore(personnage);
                    Wait.attendreUtilisateur();
                    break;
                case 3:
                    MenuServices.afficherPV(personnage);
                    Wait.attendreUtilisateur();
                    break;
                case 4:
                    personnage.modifierPV(5);
                    MenuServices.afficherBoirePotion(personnage);
                    Wait.attendreUtilisateur();
                    break;
                default:
                    continuerJeu = false;
            }
        }

        MenuServices.afficherMessageFin(personnage);
        Wait.attendre(2);
    }
}
