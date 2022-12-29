package conditional_statements;

public class Switch {
    public static void main(String[] args) {
        /*
        Instead of writing many if..else statements, you can use the switch statement.
        The switch statement selects one of many code blocks to be executed:
        */

        // General Syntax
        /*
         switch(expression) {
              case x:
                // code block
                break;
              case y:
                // code block
                break;
              default:
                // code block
            }
        */

       // All right! but how it works?
        /*
        The switch expression is evaluated once.
        The value of the expression is compared with the values of each case.
        If there is a match, the associated block of code is executed.
        The break and default keywords are optional, and will be described later in this chapter
        */

        // Example code
        int salary = 15000;

        switch (salary){
            case 5000:
                System.out.println("Hunger nerve");
                break;
            case 7000:
                System.out.println("Average of public");
                break;
            case 10000:
                System.out.println("Above the general");
            case 15000:
                System.out.println("Rich");
                break;
            default:
                System.out.println("Get out here!");

        }
    }
}
