package fr.diginamic.maison;

public class Cuisine extends Piece {
    private static final String TYPE = "cuisine";

    public Cuisine(short nombreEtages, double superficie) {
        super(nombreEtages, superficie);
    }

    public String getType() {
        return TYPE;
    }
}
