package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date dateJour1 = new Date();

        SimpleDateFormat formateurDateJour = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(formateurDateJour.format(dateJour1));

        // 19/05/2016, 23:59:30
        Date dateDeprecated = new Date(116, 04, 19, 23, 59, 30);

        SimpleDateFormat formateurDateDeprecated = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        System.out.println(formateurDateDeprecated.format(dateDeprecated));

        System.out.println(formateurDateDeprecated.format(new Date()));
    }
}
