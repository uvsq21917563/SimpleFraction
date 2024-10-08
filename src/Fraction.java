package src;

public class Fraction extends Number implements Comparable<Fraction> {

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
        return "Je suis une fraction " + numérateur + "/" + dénominateur;
    }

    public int getNumerateur() {
        return numérateur;
    }

    public int getDénominateur(){
        return dénominateur;
    }

    public double nbVirgule(){
        double n = numérateur;
        double d = dénominateur;
        return n/d;
    }

    public String add(Fraction f) {
        int fntemp = f.numérateur * dénominateur;
        int ntemp = f.dénominateur * numérateur;
        int dtemp = f.dénominateur * dénominateur;
        dénominateur = dtemp;
        numérateur = ntemp + fntemp;
        return numérateur + "/" + dénominateur;
    }

    public boolean egal(Fraction f) {
        if (nbVirgule() == f.nbVirgule()) {return true;}
        else {return false;}
    }

    public int compareTo(Fraction other) {
        // Comparaison basée sur le produit croisé pour éviter les divisions
        return Integer.compare(this.numérateur * other.dénominateur, this.dénominateur * other.numérateur);
    }

    public int intValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intValue'");
    }

    @Override
    public long longValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'longValue'");
    }

    @Override
    public float floatValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'floatValue'");
    }

    @Override
    public double doubleValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doubleValue'");
    }
}