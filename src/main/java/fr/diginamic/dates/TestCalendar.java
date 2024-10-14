package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2016, 04, 19, 23, 59, 30);
        Date date = cal1.getTime();

        SimpleDateFormat formateurCourt = new SimpleDateFormat("dd'/'MM'/'yyyy");

        System.out.println(formateurCourt.format(date));

        Calendar cal2 = Calendar.getInstance();
        Date dateJour = cal2.getTime();

        SimpleDateFormat formateurLong = new SimpleDateFormat("EEEE dd MMMM yyyy HH':'mm':'ss");
        SimpleDateFormat formateurLongFr = new SimpleDateFormat("EEEE dd MMMM yyyy HH':'mm':'ss", Locale.FRANCE);
        SimpleDateFormat formateurLongChinois = new SimpleDateFormat("EEEE dd MMMM yyyy HH':'mm':'ss", Locale.CHINA);
        SimpleDateFormat formateurLongRusse = new SimpleDateFormat("EEEE dd MMMM yyyy HH':'mm':'ss", new Locale("ru"));
        SimpleDateFormat formateurLongAllemand = new SimpleDateFormat("EEEE dd MMMM yyyy HH':'mm':'ss", Locale.GERMAN);

        System.out.println(formateurLong.format(dateJour));
        System.out.println(formateurLongFr.format(dateJour));
        System.out.println(formateurLongChinois.format(dateJour));
        System.out.println(formateurLongRusse.format(dateJour));
        System.out.println(formateurLongAllemand.format(dateJour));
    }
}
