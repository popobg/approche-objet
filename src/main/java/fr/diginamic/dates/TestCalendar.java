package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2016, 04, 19, 23, 59, 30);
        Date date2016 = cal1.getTime();

        SimpleDateFormat formateurCourt = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(formateurCourt.format(date2016));

        Calendar cal2 = Calendar.getInstance();
        Date dateJour = cal2.getTime();

        String pattern = "EEEE dd MMMM yyyy HH:mm:ss";

        SimpleDateFormat formateurLong = new SimpleDateFormat(pattern);
        SimpleDateFormat formateurLongFr = new SimpleDateFormat(pattern, Locale.FRANCE);
        SimpleDateFormat formateurLongCh = new SimpleDateFormat(pattern, Locale.CHINA);
        // Remplace "new Locale(String)"
        SimpleDateFormat formateurLongRu = new SimpleDateFormat(pattern, Locale.of("ru", "RU"));
        SimpleDateFormat formateurLongGe = new SimpleDateFormat(pattern, Locale.GERMAN);

        System.out.println(formateurLong.format(dateJour));
        System.out.println(formateurLongFr.format(dateJour));
        System.out.println(formateurLongCh.format(dateJour));
        System.out.println(formateurLongRu.format(dateJour));
        System.out.println(formateurLongGe.format(dateJour));
    }
}
