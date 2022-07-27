package july26;


import java.util.Scanner;

public class q4_f2c {
    public static void to() {
        
    }

public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.print("Input a temperature in Fahrenheit: ");

double fahrenheit = in.nextDouble();


double celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);

System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius.");

}

}

