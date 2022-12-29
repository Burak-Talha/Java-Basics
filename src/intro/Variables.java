package intro;

public class Variables {
    public static void main(String[] args) {
        /*                          Java is type-safe language
        *                   Because of that when we are creating a variable
        *                   we should tell them what we are goint to use.
        *  */

        /*                          Primitive Data Types
        *  int -> integer | Ex: 5,6
        *  double -> decimal number(64 bits) | Ex: 3.14
        *  float -> decimal number(32 bits)
        *  char -> character | Ex: 'F'
        *  boolean -> condition result | Ex: true, false
        *  String -> text characters | Ex: "Hi! my name is prometheus"
         */

        // Variable Type variable_name = value;

        String email = "xyz@gmail.com";
        System.out.println(email);


        int number = 25;
        System.out.println("Before Change :" + number);
        // Also we can declare a variable
        number = 30;
        System.out.println("After Change :" + number);


        int number_1 = 30;
        int number_2 = 2;
        System.out.println(number_1*number_2);


        // Final Variables(not changeable)

        final double pi = 3.14;
        System.out.println(pi);

        // Will throw an exception
        //pi = 180;
    }
}
