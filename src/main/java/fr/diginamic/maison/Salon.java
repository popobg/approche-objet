package fr.diginamic.maison;

public class Salon extends Piece {
    private static final String TYPE = "salon";

    public Salon(short nombreEtages, double superficie) {
        super(nombreEtages, superficie);
    }

    public String getType() {
        return TYPE;
    }
}
