package loop;

public class Do_While {
    public static void main(String[] args) {
        // Do-While
            /*
            This loop will execute the code block once, before checking if the condition is true,
            then it will repeat the loop as long as the condition is true.
            */
            /*
                        Syntax
                do {
                  // code block to be executed
                }
                while (condition);
             */

        // Example:(Also it will work five time)
        int j = 1;
        do {
            System.out.println(j);
            j++;
        }
        while (j <= 5);

    }
}
