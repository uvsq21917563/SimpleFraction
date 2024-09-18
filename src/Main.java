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

        assert testFraction4.add(UN).equals("15/10");
        assert testFraction4.add(ZERO).equals("5/10");

        assert testFraction.egal(testFraction2) == true;
        Fraction tesFraction6 = new Fraction(10,20);
        assert testFraction4.egal(tesFraction6) == true;

        Fraction testFraction7 = new Fraction(1, 2);
        Fraction testFraction8 = new Fraction(3, 4);
        assert testFraction7.compareTo(testFraction8) < 0 : "Erreur dans la comparaison : 1/2 doit être plus petit que 3/4";
        assert testFraction8.compareTo(testFraction7) > 0 : "Erreur dans la comparaison : 3/4 doit être plus grand que 1/2";
        assert testFraction7.compareTo(new Fraction(2, 4)) == 0 : "Erreur dans la comparaison : 1/2 doit être égal à 2/4";

        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8 :
                "Erreur dans la comparaison de Number : la somme doit être proche de 1.5";
    }
}