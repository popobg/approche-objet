package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "12";

        int number = Integer.parseInt(chaine);

        int a = 9;
        int b = -3;

        // Math.max works too
        int max = Integer.max(a, b);
        System.out.printf("Le maximum entre %s et %s est %s.", a, b, max);
    }
}
