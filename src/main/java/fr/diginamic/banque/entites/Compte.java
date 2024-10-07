package fr.diginamic.banque.entites;

public class Compte {
    // composé de caractères alphanumériques
    private final String numeroCompte;
    private double solde;

    public Compte(String numeroCompte, double solde_compte) {
        this.numeroCompte = numeroCompte;
        this.solde = solde_compte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", soldeCompte=" + solde +
                '}';
    }

    public String getNumeroCompte() {
        return this.numeroCompte;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double newSolde) {
        this.solde = newSolde;
    }
}
