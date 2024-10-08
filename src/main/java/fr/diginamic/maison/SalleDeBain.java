package fr.diginamic.maison;

public class SalleDeBain extends Piece {
    private static final String TYPE = "salle de bain";

    public SalleDeBain(short nombreEtages, double superficie) {
        super(nombreEtages, superficie);
    }

    public String getType() {
        return TYPE;
    }
}
