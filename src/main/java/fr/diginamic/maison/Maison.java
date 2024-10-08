package fr.diginamic.maison;

import java.util.Arrays;
import java.lang.reflect.Field;

public class Maison {
    // association
    Piece[] pieces = {};

    public void ajouterPiece(Piece piece) {
        // Gestion des cas d'erreurs :
        // évite l'ajout d'élément null dans le tableau,
        // ou d'une pièce aux données incohérentes (superficie ou étage négatifs)
        if (piece == null
                || piece.getNombreEtages() < 0.0
                || piece.getSuperficie() <= 0.0) {
            return;
        }

        pieces = Arrays.copyOf(this.pieces, this.pieces.length + 1);
        pieces[pieces.length - 1] = piece;
    }

    public double calculerSuperficieTotale() {
        double superficieTotale = 0;

        for (Piece p : this.pieces) {
            superficieTotale += p.getSuperficie();
        }

        return superficieTotale;
    }

    public double calculerSuperficieEtage(short etage) {
        double superficieEtage = 0;

        for (Piece p : this.pieces) {
            if (p.getNombreEtages() == etage) {
                superficieEtage += p.getSuperficie();
            }
        }

        return superficieEtage;
    }

    public double calculerSuperficieParTypePiece(String type) {
        double superficieParType = 0;

        for (Piece p : this.pieces) {
            if (p.getType().equals(type.toLowerCase())) {
                superficieParType += p.getSuperficie();
            }
        }

        return superficieParType;
    }

    public int calculerNombrePiecesParType(String type) {
        int nbPiecesType = 0;

        for (Piece p : this.pieces) {
            if (p.getType().equals(type.toLowerCase())) {
                nbPiecesType += 1;
            }
        }

        return nbPiecesType;
    }
}
