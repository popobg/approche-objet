package utils;

public class StringUtils {
    public static String append(Object... objets) {
        StringBuilder builder = new StringBuilder();

        for (Object o: objets) {
            builder.append(o);
        }

        return builder.toString();
    }
}
