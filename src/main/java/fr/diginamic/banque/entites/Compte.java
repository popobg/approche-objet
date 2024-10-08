package fr.diginamic.banque.entites;

public class Compte {
    // composé de caractères alphanumériques
    protected final String numeroCompte;
    protected double solde;

    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", solde=" + solde +
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
