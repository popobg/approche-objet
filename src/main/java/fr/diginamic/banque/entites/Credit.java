package fr.diginamic.banque.entites;

public class Credit extends Operation {
    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String toString() {
        String operation = super.toString();
        return operation.replace("Operation{", "Crédit{");
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
