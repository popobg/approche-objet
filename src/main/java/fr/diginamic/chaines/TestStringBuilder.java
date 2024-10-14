package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        long debutBuilder = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
//        String build = "";
//        String stringConcat = "";

        for (int i = 0; i <= 100_000; i++) {
            builder.append(i);
//            build += i;
//            stringConcat = stringConcat.concat(Integer.toString(i));
        }

        long finBuilder = System.currentTimeMillis();
        System.out.println("Temps écoulé en ms : " + (finBuilder - debutBuilder));

        long debutOpePlus = System.currentTimeMillis();
        String build = "";

        for (int i = 0; i <= 100_000; i++) {
            build += i;
        }

        long finOpePlus = System.currentTimeMillis();
        System.out.println("Temps écoulé en ms : " + (finOpePlus - debutOpePlus));

        long debutConcat = System.currentTimeMillis();
        String stringConcat = "";

        for (int i = 0; i <= 100_000; i++) {
            stringConcat = stringConcat.concat(Integer.toString(i));
        }

        long finConcat = System.currentTimeMillis();
        System.out.println("Temps écoulé en ms : " + (finConcat - debutConcat));
    }
}
