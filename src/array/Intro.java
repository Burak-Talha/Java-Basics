package array;

import java.util.Arrays;
import java.util.Comparator;

public class Intro {
    public static void main(String[] args) {
        /*
         Arrays are used to store multiple values in a single variable,
         instead of declaring separate variables for each value.
        */

        // Create a array(size = 5)
        String[] names = new String[3];

        // Setting variable
        names[0] = "Fusion Robotics";
        names[1] = "Pars Robotics";
        names[2] = "Anka Robotics";

        // Reaching elements
        System.out.println("FRC team name :"+names[0]);
        System.out.println("FRC team name :"+names[1]);
        System.out.println("FRC team name :"+names[2]);

        // Find array size
        System.out.println("Array size :"+names.length);
    }
}
