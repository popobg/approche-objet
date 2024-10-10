package fichier;

import fichier.entites.Commune;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) {
        List<Commune> communes = new ArrayList<>();

        // récupérer le chemin du dossier actuel :
        // s'adapte au chemin dans lequel l'utilisateur stocke le projet.
        String repertoireActuel = Paths.get(".").toAbsolutePath().toString();
        String repertoireActuelModifie = repertoireActuel.substring(0, repertoireActuel.length() - 1);
        // ajouter le chemin du fichier depuis la racine du projet
        String recensementStringPath = repertoireActuelModifie + "src\\main\\java\\fichier\\recensement.csv";

        /*
        Si le code précédent ne fonctionne pas, indiquer simplement comme
        paramètre de la méthode `get()` le path absolu vers le fichier
        sur votre machine.
         */
        Path recensementPath = Paths.get(recensementStringPath);

        // LIRE ET RECUPERER LES INFORMATIONS
        List<String> listeLignes = new ArrayList<>();
        if (Files.exists(recensementPath)) {
            try {
                listeLignes = Files.readAllLines(recensementPath);
            }
            catch (IOException e) {
                System.out.println("Le contenu du fichier n'a pas pu être récupéré.");
            }
        }

        // STOCKER LES INFORMATIONS DANS UNE LISTE D'OBJET COMMUNE
        // On saute la première ligne qui contient les en-têtes
        for (int i = 1; i < listeLignes.size(); i++) {
            String[] ligneSplitted = listeLignes.get(i).split(";");

            String codeDepartement = ligneSplitted[2].trim();
            String nom = ligneSplitted[6].trim();
            int popTotale = Integer.parseInt(ligneSplitted[ligneSplitted.length - 1].replaceAll(" ", ""));
            String region = ligneSplitted[1].trim();

            Commune commune = new Commune(codeDepartement, nom, popTotale, region);

            communes.add(commune);
        }

        System.out.println("Nombre de communes contenu dans la liste communes : " + communes.size());

        // ECRIRE LE FICHIER DE SORTIE CONTENANT LES VILLES > 25000 HAB
        List<String> grandesCommunesListe = new ArrayList<>();

        // Ecriture de la première ligne du fichier de sortie :
        grandesCommunesListe.add("Nom de la commune;Code département;Nom de la région; Population totale;");

        for (Commune commune : communes) {
            if (commune.getPopTotale() >= 25000) {
                grandesCommunesListe.add(commune.toString());
            }
        }

        // création du fichier de sortie
        Path recesencementOutPath = Paths.get(repertoireActuelModifie + "src\\main\\java\\fichier\\recensement_out.csv");
        try {
            Files.write(recesencementOutPath, grandesCommunesListe);
        }
        catch (IOException e) {
            System.out.println("Impossibilité d'écrire dans le fichier recensement_out");
        }
    }
}
