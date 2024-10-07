package fr.diginamic.banque.entites;

public abstract class Operation {
    String dateOperation;
    double montantOperation;

    public Operation(String date, double montant) {
        this.dateOperation = date;
        this.montantOperation = montant;
    }

    @Override
    public String toString() {
        return "{" +
                "dateOperation='" + dateOperation + '\'' +
                ", montantOperation=" + montantOperation +
                '}';
    }

    public abstract String getType();

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(double montantOperation) {
        this.montantOperation = montantOperation;
    }
}
