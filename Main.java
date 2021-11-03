/**
 * Testing class for Fraction.
 *
 * Victor Yao
 * 11/3/2021
 */

public class Main
{
    public static void main(String[] args)
    {
        Fraction defFrac = new Fraction();
        System.out.println(defFrac);
        
        Fraction frac0Den = new Fraction(1, 0);
        System.out.println(frac0Den);
        
        defFrac.setNum(2);
        defFrac.setDen(0);
        System.out.println(defFrac);
        
        Fraction copyFrac = new Fraction(defFrac);
        copyFrac.setNum(3);
        System.out.println(copyFrac);
        
        System.out.println(copyFrac.getDoubleValue());
        
        copyFrac.setNum(4);
        System.out.println(copyFrac.getIntValue());
        System.out.println(copyFrac.getRemainder());
        
        Fraction toSimplify = new Fraction(10, 5);
        System.out.println(toSimplify);
        System.out.println(toSimplify.simplify());
    }
}
