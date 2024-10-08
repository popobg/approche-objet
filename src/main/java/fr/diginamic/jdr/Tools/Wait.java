package fr.diginamic.jdr.Tools;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Wait {
    public static void attendre(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void attendreUtilisateur() {
        System.out.println("Appuyez sur Entrée pour continuer.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
