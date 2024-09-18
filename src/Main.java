package src;
public class Main {

    static Fraction ZERO = new Fraction(0,1);
    static Fraction UN = new Fraction(1,1);
    public static void main(String[] args){
        Fraction testFraction = new Fraction(0, 1);
        Fraction testFraction2 = new Fraction(0);
        Fraction testFraction3 = new Fraction();
        
        assert testFraction.toString().equals("Je suis une fraction 0/1") : "Compilateur n&d disfonctionnel";
        assert testFraction2.toString().equals("Je suis une fraction 0/1"): "Compilateur n disfonctionnel";
        assert testFraction3.toString().equals("Je suis une fraction 0/1"): "Compilateur disfonctionnel";
   
        Fraction testFraction4 = new Fraction(5, 10);
        assert testFraction4.nbVirgule() == 0.5;
        Fraction testFraction5 = new Fraction(1, 3);
        assert testFraction5.nbVirgule() == 0.3333333333333333;
        System.out.println(testFraction5.nbVirgule());
    }
}