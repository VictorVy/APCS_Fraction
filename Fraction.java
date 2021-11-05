/**
 * 
 * Fraction class which stores a numerator and denominator.
 *
 * @author Victor Yao
 * @version 11/3/2021
 * 
 */

public class Fraction
{
    private int num, den;
    
    /**
     * Creates a Fraction with numerator 0 and denominator 1.
     */
    public Fraction()
    {
        num = 0;
        den = 1;
    }
    
    /**
     * Creates a Fraction with a specified numerator and denominator.
     * @param num the numerator of the fraction
     * @param dec the denominator of the fraction
     */
    public Fraction(int num, int den)
    {
        this.num = num;
        setDen(den);
    }
    
    /**
     * Creates a Fraction from a formatted String.
     * @param frac a String representing a fraction, in the format "num/den"
     */
    public Fraction(String frac)
    {
        Fraction parsed = parseFrac(frac);
        num = parsed.num;
        den = parsed.den;
    }
    
    /**
     * Creates a Fraction with numerator and denominator values copied from Fraction frac.
     * @param frac the Fraction to be copied
     */
    public Fraction(Fraction frac)
    {
        num = frac.num;
        den = frac.den;
    }
    
    /**
     * Returns a simplified version of the specified Fraction.
     * @param frac the Fraction to be simplified
     * @return the simplified Fraction
     */
    public static Fraction simplify(Fraction frac)
    {
        int n = frac.num, d = frac.den;
        
        for(int i = Math.min(n, d); i >= 2; i--)
        {
            if(n % i == 0 && d % i == 0)
            {
                n /= i;
                d /= i;
                break;
            }
        }
        
        return new Fraction(n, d);
    }
    
    /**
     * Returns a simplified version of the String-respresented Fraction.
     * @param frac the String Fraction, formatted as "num/den", to be simplified
     * @return the simplified Fraction
     */
    public static Fraction simplify(String frac) { return simplify(parseFrac(frac)); }
    
    // /**
     // * Adds two Fractions and returns the simplified sum.
     // * @param a the first Fraction to be added
     // * @param a the second Fraction to be added
     // */
    // public static Fraction add(Fraction a, Fraction b) 
    // {
        
    // }
    
    /**
     * Multiplies two Fractions and returns the simplified product.
     * @param a the first Fraction to be multiplied
     * @param a the second Fraction to be multiplied
     */
    public static Fraction multiply(Fraction a, Fraction b) { return simplify(new Fraction(a.num * b.num, a.den * b.den)); }
    
    /**
     * Multiplies the Fraction with another specified Fraction.
     * @param frac the Fraction to multiply with
     */
    public void multiply(Fraction frac) 
    {
        num *= frac.num;
        den *= frac.den;
    }
    
    /**
     * Divides the Fraction by another specified Fraction.
     * @param frac the Fraction to divide by
     */
    public void divide(Fraction frac) 
    {
        num /= frac.num;
        den /= frac.den;
    }
    
    /**
     * Divides two Fractions and returns the simplified quotient.
     * @param a the dividend Fraction
     * @param a the divisor Fraction
     */
    public static Fraction divide(Fraction a, Fraction b) { return simplify(new Fraction(a.num / b.num, a.den / b.den)); }
    
    /**
     * Parses a String in the format "num/den", returning the represented Fraction.
     * @param frac a String representing a fraction, in the format "num/den" 
     */
    public static Fraction parseFrac(String frac)
    {
        return new Fraction(Integer.parseInt(frac.substring(0, frac.indexOf("/"))),
                            Integer.parseInt(frac.substring(frac.indexOf("/") + 1)));
    }
    
    /**
     * Returns a String representation of the Fraction, formatted as "num/den".
     * @return the Fraction represented as a String
     */
    public String toString() { return num + "/" + den; }
    
    /**
     * 
     */
    
    /**
     * Returns the result of the integer division between the numerator and denominator.
     * @return integer representation
     */
    public int getIntValue() { return num / den; }
    
    /**
     * Returns the remainder of the integer division between the numerator and denominator.
     * @return remainder
     */
    public int getRemainder() { return num % den; }
    /**
     * Returns the result of the double division between the numerator and denominator.
     * @return double representation
     */
    public double getDoubleValue() { return (double) num / den; }
    /**
     * Returns the numerator of the Fraction.
     * @return numerator
     */
    public int getNum() { return num; }
    /**
     * Returns the denominator of the Fraction.
     * @return denominator
     */
    public int getDen() { return den; }
    /**
     * Assigns the numerator of the Fraction.
     * @param value to be set
     */
    public void setNum(int num) { this.num = num; }
    /**
     * Assigns the denominator of the Fraction. Handles non-zero values.
     * @param value to be set
     */
    public void setDen(int den)
    {
        if(den == 0) System.out.println("Denominator cannot be 0.");
        else this.den = den;
    }
}
