package intro;

public class Operators {
    public static void main(String[] args) {

        // Java divides the operators into the following groups:
        /*
        * Arithmetic operators
        * Assignment operators
        * Comparison operators
        * Logical operators
        */

    // Arithmetic Operators

            /*
                +	Addition	Adds together two values	x + y
                -	Subtraction	Subtracts one value from another	x - y
                *	Multiplication	Multiplies two values	x * y
                /	Division	Divides one value by another	x / y
                %	Modulus	Returns the division remainder	x % y
                ++	Increment	Increases the value of a variable by 1	++x
                --	Decrement	Decreases the value of a variable by 1
            */
        System.out.println("----------Arithmetic Operators Output------------");
            // Examples

            int numberOne = 120, numberTwo = 5, numberThree = 24, numberFour = 3;

            int result;

                // Addition
                result = numberOne + numberTwo;
                System.out.println("Addition :"+result);

                // Subtraction
                result = numberThree - numberFour;
                System.out.println("Subtraction :"+result);

                // Multiplication
                result = numberTwo * numberThree;
                System.out.println("Multiplication :"+result);

                // Division
                result = numberOne / numberTwo;
                System.out.println("Division :"+result);

                // Modulus
                result = numberOne % numberTwo;
                System.out.println("Modulus :"+result);

                // Increment / Decrement
                System.out.println("Before change value :"+numberFour);
                numberFour++;
                System.out.println("After change value :"+numberFour);

                System.out.println("Before change value :"+numberThree);
                numberThree--;
                System.out.println("After change value :"+numberThree);



    // Assignment Operators
        /* Generally we are using '=' operator
        *  but we can those shortcuts
        *
        *   =	x = 5	x = 5
        *   +=	x += 3	x = x + 3
        *   -=	x -= 3	x = x - 3
        *   *=	x *= 3	x = x * 3
        *   /=	x /= 3	x = x / 3
        *   %=	x %= 3	x = x % 3
        *   ^=	x ^= 3	x = x ^ 3
        */
        System.out.println("----------Assignment Operators Output------------");
        //Example

        int number_o = 5;
        int number_t = 3;

        // Long Version
        number_o = number_o + number_t;
        System.out.println("Long :"+number_o);
        // Short Version
        number_o+=number_t;
        System.out.println("Short :"+number_o);

    // Comparison Operators
        /*
        *    ==	Equal to	x == y
        *    !=	Not equal	x != y
        *    >	Greater than	x > y
        *    <	Less than	x < y
        *    >=	Greater than or equal to	x >= y
        *    <=	Less than or equal to	x <= y
        * */
        System.out.println("----------Comparison Operators Output------------");
        // Example

        // Result : true
        System.out.println(10 > 7);

        // Result : false
        System.out.println(7 == 8);

        // Result : true
        System.out.println(10 >= 10);

    // Logical Operatos

     /* You can also test for true or false values with logical operators. */

     /*
     * && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
     * || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
     * !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
     * */
        System.out.println("----------Logical Operators Output------------");
        // Example

        // && -> and

        // Result : true
        System.out.println(10 > 5 && 8 < 9);

        // Result : false
        System.out.println(10 >= 11 && 8 != 7);

        // || -> or

        // Result : true
        System.out.println(7 == 7 || 7 !=7);

        // Result : false
        System.out.println(10%3==1 || 7 < 12);
    }
}
