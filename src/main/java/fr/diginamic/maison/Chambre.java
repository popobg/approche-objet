package fr.diginamic.maison;

public class Chambre extends Piece {
    private static final String TYPE = "chambre";

    public Chambre(short nombreEtages, double superficie) {
        super(nombreEtages, superficie);
    }

    public String getType() {
        return TYPE;
    }
}
