package july26;

import java.util.Scanner;

// Q2. Check for Palindrome numbers in the input and do the same for strings ?
public class q2_palindrome_checker {


    public static boolean checkNumberisPalindrome(int num) {

            int reverse = 0;
            int temp = num;
            
            while(temp != 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }
            
            if(num == reverse) {
                
                return true;
            }
            else {
              return false;
            }
    }
    public static boolean checkStringisPalindrome(String str) {
        String reverse = "";
      
      for(int i = str.length() - 1; i >= 0; i--) {
         reverse = reverse + str.charAt(i);
      }
      
      if(str.equals(reverse)) {
         return true;
      }
      else {
         return false;
      }
   }
    

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        while(true){
            System.out.println("Enter [ 1 ] to run palindrome for number or Enter [ 2 ] to run palindrome for string");
              
            
            String nums =scan.next();
            
         
            if(nums.equals("1")){
                // Run palindrome for number
                System.out.println("Enter number to check if it is a palindrome :");

                int number=scan.nextInt();

                System.out.println(checkNumberisPalindrome(number));
                
            }
            else if(nums.equals("2")){
                // Run palindrome for string
                System.out.println("Enter a string to check if it is a palindrome :");

                String str=scan.next();

                System.out.println(checkStringisPalindrome(str));    

            }
            else{
                // Error out of program
                
                System.out.println("Please enter a valid output");
            }
           
            
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

