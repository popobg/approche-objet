package sets;

import sets.utils.Tools;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> setDouble = new HashSet<>();
        Collections.addAll(setDouble, 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);

        System.out.println("Le maximum du set est : " + Collections.max(setDouble));

        Double min = Collections.min(setDouble);

        Iterator<Double> iterSet = setDouble.iterator();
        while(iterSet.hasNext()) {
            Double number = iterSet.next();

            if (number.equals(min)) {
                iterSet.remove();
            }
        }

        Tools.afficherCollectionDouble(setDouble, "Voici les éléments du set après suppression du minimum : ");
    }
}
