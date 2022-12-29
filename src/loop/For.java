package loop;

public class For {
    public static void main(String[] args) {


        // For loop :

            /*
             When you know exactly how many times you want to loop through a block of code,
             use the for loop instead of a while loop:
            */

        /*
                        Syntax
              for (statement 1; statement 2; statement 3) {
                  // code block to be executed
                }
         */

        // How it works?
        /*
        Statement 1 is executed (one time) before the execution of the code block.
        Statement 2 defines the condition for executing the code block.
        Statement 3 is executed (every time) after the code block has been executed.
        * */

        // Example:
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        // Also we can create nested-loop
        for(int i = 1; i <= 10; i++){
            System.out.println(i+".row");
            for(int j = 1; j<=10; j++){
                System.out.print((i*j)+" \n");
            }
        }

    }
}
