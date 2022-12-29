package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        /*
         Arrays are used to store multiple values in a single variable,
         instead of declaring separate variables for each value.
        */

        // Creating array: path 1
        double[] dollarToTl = {15.6, 17.89, 12.05, 16};

        // Creating array: path 2
        int[] salaries = new int[8];

        // Print indexes & set index values
        System.out.println("Before change :"+dollarToTl[0]);
        dollarToTl[0] = 15;

        System.out.println("After change :"+dollarToTl[0]);


        // Show array length
        System.out.println("Array size :"+dollarToTl.length);



    // Email Example
        Scanner scan=new Scanner(System.in);

        String[] emails = new String[2];

        for(int i = 0; i <= 1; i++){
            System.out.println(i+". value");
            System.out.println("Email giriniz :");
            emails[i] = scan.nextLine();
        }

        System.out.println(emails[0]);
        System.out.println(emails[1]);


        int[] numbers = {1, 3, 5, 7 , 9, 12};


        // Printing array elements with different loop type
        for(int x = 0; x <= 5; x++){
            System.out.print(numbers[x]+", ");
        }

        int x = 5;
        while(x >= 0){
            System.out.println(numbers[x]+", ");
            x--;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
