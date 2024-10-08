package fr.diginamic.maison;

public class WC extends Piece {
    private static final String TYPE = "wc";

    public WC(short nombreEtages, double superficie) {
        super(nombreEtages, superficie);
    }

    public String getType() {
        return TYPE;
    }
}
