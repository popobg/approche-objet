package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) {
        String repertoireActuel = Paths.get(".").toAbsolutePath().toString();
        String repertoireActuelModifie = repertoireActuel.substring(0, repertoireActuel.length() - 1);
        String recensementStringPath = repertoireActuelModifie + "src\\main\\java\\fichier\\recensement.csv";

        Path recensementPath = Paths.get(recensementStringPath);

        List<String> lignes = new ArrayList<>();
        if (Files.exists(recensementPath)) {
            try {
                lignes = Files.readAllLines(recensementPath);
            }
            catch (IOException e) {
                System.out.println("Le contenu du fichier n'a pas pu être récupéré.");
            }
        }

        List<String> first100Lines = new ArrayList<>();
        if (lignes.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                first100Lines.add(lignes.get(i));
            }
        }

        String recensementCopieStringPath = repertoireActuelModifie + "src\\main\\java\\fichier\\recensement_copy_100.csv";
        Path recensementCopiePath = Paths.get(recensementCopieStringPath);

        try {
            Files.write(recensementCopiePath, first100Lines);
            }
        catch (IOException e) {
            System.out.println("Impossibilité d'écrire dans le fichier recensement_copy_100");
            }
        }
}
