package conditional_statements;

public class If_Else {
    public static void main(String[] args) {
        // If-Else
        // Java supports the usual logical conditions from mathematics:
        /*
            Less than: a < b
            Less than or equal to: a <= b
            Greater than: a > b
            Greater than or equal to: a >= b
            Equal to a == b
            Not Equal to: a != b

            These output type is boolean. So we can use them in our condition.
            boolean isOk = true, false
        */

        // Java have 4 keyword for controlling cases
        /*
        Use 'if' to specify a block of code to be executed, if a specified condition is true
        Use 'else' to specify a block of code to be executed, if the same condition is false
        Use 'else if' to specify a new condition to test, if the first condition is false
        Use 'switch' to specify many alternative blocks of code to be executed
        */

        // If example:

        boolean isTrue = 9 < 5;

        // if isTrue ok -> run if block
        if(isTrue){
            System.out.println("nine greater than five");
        }
        // if not -> run else block
        else{
            System.out.println("five is not greater than nine");
        }

        // Also we can use else-if for different variations

        int number_1 = 5;
        int number_2 = 6;

        if(number_1 > number_2) {
            System.out.println("Number 1 is bigger than number 2");
        } else if (number_1 < number_2) {
            System.out.println("Number 2 is bigger than number 1");
        } else{
            System.out.println("Number 1 and number 2 equals");
        }


        // Also java have short if-else this is also named 'short-hand if-else'
            // General Syntax : variable = (condition) ? expressionTrue :  expressionFalse;

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // Note that: short-hand if-else isn't contains 'else-if' variation

    }
}
