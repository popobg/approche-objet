package fr.diginamic.chaines;

import static utils.StringUtils.append;

public class TestMethodeAppend {
    public static void main(String[] args) {
        int age = 15;
        String nom = "Lee";

        String resultat = append("Bonjour, je suis M.", nom, ". J'ai ", age, " ans.");
        System.out.println(resultat);
    }

}
