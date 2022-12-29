package loop;

public class While {
    public static void main(String[] args) {
        /*
        Loops can execute a block of code as long as a specified condition is reached.
        Loops are handy because they save time, reduce errors, and they make code more readable.
        */

        // Java have 3 different loop. Those are while, for, do-while

        // While

            // The while loop loops through a block of code as long as a specified condition is true:
            /*
                    Syntax
                while (condition) {
                     code block to be executed
                }
             */

            // Example:(In this example code block will execute five time)
            int i = 0;
            while (i < 5) {
                System.out.println(i);
                i++;
            }
    }
}
