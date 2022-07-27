package july26;
import java.util.Scanner;;

public class q1_reverse_using_stringbuilder {

    public static StringBuilder reverse(String str) {

        StringBuilder reverse_of_str=new StringBuilder();
        if(str.length()==0){
                reverse_of_str.append(str);
                return reverse_of_str;
        }

        
         reverse_of_str=reverse_of_str.append(str);

        reverse_of_str=reverse_of_str.reverse();
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
