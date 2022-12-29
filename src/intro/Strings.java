package intro;

public class Strings {
    public static void main(String[] args) {
        // Strings are used for storing text.

    // Creating a basic string
    String mail = "archer@hotmail.com";

    // String Features

        // Size of string
        System.out.println("Mail size :"+mail.length());

        // Upper & Lower case
        System.out.println("UPPER MAIL :"+mail.toUpperCase());
        System.out.println("lower mail :"+mail.toLowerCase());

        // Let's look more features
        String mt = "  ";
        System.out.println("Is Empty :"+mt.isEmpty());
        System.out.println("Is blank :"+mt.isBlank());

        // Equals ?
        System.out.println("Equal :"+("normal".equals("normal")));

    // Concatenation
        System.out.println("Concatenation Transactions");
        // Manual Path
        String prefix = "WINNER\t";
        String firstName = "Fusion ";
        String lastName = "Robotics";
        System.out.println(prefix + firstName + lastName);
        // Func Path
        System.out.println(prefix.concat(firstName.concat(lastName)));


    }
}
