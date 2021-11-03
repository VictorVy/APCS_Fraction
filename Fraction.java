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
     * @param frac String fraction in the format "num/den"
     */
    
    public Fraction(String frac)
    {
        num = Integer.parseInt(frac.substring(0, frac.indexOf("/")));
        setDen(Integer.parseInt(frac.substring(frac.indexOf("/") + 1)));
    }
    
    public Fraction(Fraction frac)
    {
        num = frac.num;
        den = frac.den;
    }
    
    /**
     * Returns a simplified version of the fraction.
     */
    
    public Fraction simplify()
    {
        int n = num, d = den;
        
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
    
    public String toString() { return num + "/" + den; }
    
    public int getIntValue() { return num / den; }
    public int getRemainder() { return num % den; }
    public double getDoubleValue() { return (double) num / den; }
    
    public int getNum() { return num; }
    public int getDen() { return den; }
    public void setNum(int num) { this.num = num; }
    public void setDen(int den)
    {
        if(den == 0) System.out.println("Denominator cannot be 0.");
        else this.den = den;
    }
}
