package july26;
import java.util.Scanner;

public class q4_f2c {
    public static void to() {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter fahrenheit value:");
      String a=sc.next();
      try{
          //converting String to float value
       float f= Float.parseFloat(a);
       System.out.printf("Fahrenheit %s is equal  to Celsius value of : %.2f \n",f,(5*(f-32))/9);
       //Handling code if the entered string is not float
    }catch(NumberFormatException e){
        System.out.println("Calculation is not possible if number is not provided.");
    }
    
   }
   public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    Scanner scan =new Scanner(System.in);
    while(true){
        to();
        System.out.println("Do you want to continue: Press 1 or enter any key to quit.");
        String num=scan.next();
        if(num.equals("1")){
            continue;
        }
        else{
            System.out.println("Quitting the program");
            break;
        }
    }
        

   }

}

