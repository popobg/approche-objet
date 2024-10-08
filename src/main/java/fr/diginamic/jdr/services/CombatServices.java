package fr.diginamic.jdr.services;

import fr.diginamic.jdr.tools.Wait;
import fr.diginamic.jdr.entites.Creature;
import fr.diginamic.jdr.entites.Personnage;

public class CombatServices {
    public static boolean lancerCombat(Personnage perso, Creature creature) {
        MenuServices.afficherEtat(perso, creature);
        Wait.attendre(3);

        while (perso.getPV() > 0 && creature.getPV() > 0) {
            int attaqueJoueur = perso.calculerAttaque();
            int attaqueCreature = creature.calculerAttaque();

            if (attaqueJoueur > attaqueCreature) {
                int degatsSubis = attaqueJoueur - attaqueCreature;
                MenuServices.afficherIssueCombat(perso, creature, degatsSubis);
                creature.modifierPV(-degatsSubis);
            }
            else if (attaqueJoueur < attaqueCreature) {
                int degatsSubis = attaqueCreature - attaqueJoueur;
                MenuServices.afficherIssueCombat(creature, perso, degatsSubis);
                perso.modifierPV(-degatsSubis);
            }
            else {
                MenuServices.afficherEgalite(perso, creature);
            }

            MenuServices.afficherEtat(perso, creature);
            Wait.attendreUtilisateur();
        }

        if (perso.getPV() == 0) {
            MenuServices.afficherMort(perso, creature);
            Wait.attendreUtilisateur();
            return false;
        }
        else {
            perso.augmenterScore(creature);
            MenuServices.afficherVictoire(perso, creature);
            Wait.attendreUtilisateur();
            return true;
        }
    }
}
