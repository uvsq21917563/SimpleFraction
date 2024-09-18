package src;

public class Fraction {

    private int dénominateur;
    private int numérateur;

    public Fraction(int numérateur, int dénominateur) {
        this.numérateur = numérateur;
        this.dénominateur = dénominateur;
    }

    public Fraction(int numérateur) {
        this.numérateur = numérateur;
        this.dénominateur = 1;
    }

    public Fraction() {
        this.numérateur = 0;
        this.dénominateur = 1;
    }
    
    public String toString() {
        return "Je suis une fraction" + numérateur + "/" + dénominateur;
    }
}