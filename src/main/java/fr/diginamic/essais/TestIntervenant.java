package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        // Etape 1 : implémentation des classes
        Salarie salarie = new Salarie("Durand", "Michel", 1650);
        Pigiste pigiste = new Pigiste("Durand", "Eleonore", 14, 80);

        System.out.println("Salaire mensuel du salarié : " + salarie.getSalaire());
        System.out.println("Salaire mensuel du pigiste : " + pigiste.getSalaire());

        // Etape 2 : afficher les données
        salarie.afficherDonnees();
        pigiste.afficherDonnees();
    }
}
