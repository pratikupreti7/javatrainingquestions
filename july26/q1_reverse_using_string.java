
package july26;

import java.util.Scanner;

/*
    Q1. Implement reverse of the string using string and string builder without using any methods from the classes;
    // (Hint :- to add anything to a string builder you use s.append("") to add it to the end of the value and insert() 
    to insert any string at a position)
*/

public class q1_reverse_using_string{
    

    public static String reverse(String str) {
        if(str.length()==0){
                return str;
        }

         String reverse_of_str="";
        
        for (int i = 0; i < str.length(); i++) {
            reverse_of_str=str.charAt(i)+reverse_of_str;
        }

        return reverse_of_str;
    }

    public static void main(String[] args) {
     

   
    while(true){
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the string you want to reverse:");
        String ch=scan.nextLine();
        System.out.printf("Reverse of %s is %s",ch,reverse(ch));
        System.out.println();
        System.out.println("Do you want to continue: Press 1 or enter any key to quit.");
        String num=scan.next();
        
        if(num.equals("1")){
            continue;
        }
        else{
            System.out.println("Quitting the program");
            scan.close();
            break;
        }
        
    }


}
}


