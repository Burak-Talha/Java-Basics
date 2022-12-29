package intro;
import java.lang.Math;
public class MathLib {
    public static void main(String[] args) {
        // Java Math is important library for daily transactions

        // Math max()
        /*The Math.max(x,y) method can be used to find the highest value of x and y:*/
        System.out.println(Math.max(5, 6));

        // Math min()
        /*The Math.min(x,y) method can be used to find the lowest value of x and y:*/
        System.out.println(Math.min(5, 10));

        // Math sqrt()
        /*The Math.sqrt(x) method returns the square root of x:*/
        System.out.println(Math.sqrt(64));

        // Math abs()
        /*The Math.abs(x) method returns the absolute (positive) value of x:*/
        System.out.println(Math.abs(-4.7));

        // Math random()
        /*Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):*/
        System.out.println(Math.random()*101);
    }
}
