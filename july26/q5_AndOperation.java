package july26;
import java.util.*;
public class q5_AndOperation
{
    private static void andOperation() {

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter first Binary value: ");
            String first=sc.next();
            System.out.print("Enter second Binary value: ");
            String second=sc.next();
            int size=first.length()>second.length()?first.length():second.length();// might be both binary string have different length
            // validate both are binary form or not
            for(int i=0;i<size;i++){
                if(i<first.length() && (first.charAt(i)!='0' && first.charAt(i)!='1')){
                    System.out.println("Invalid binary");
                    return;
                }
                if(i<second.length() && (second.charAt(i)!='0' && second.charAt(i)!='1')){
                    System.out.println("Invalid binary");
                    return;
                }
            }
            // perform Bitwise AND operation
            //we will perform AND operation small length binary string because rest of would be 0
            int minLength=first.length()<second.length()?first.length():second.length();
            String res="";
            for(int i=0;i<minLength;i++){
                if(first.charAt(i)=='1' && second.charAt(i)=='1'){
                    res=res+'1';// if both are true then resultant would be true bit
                }else{
                    res=res+'0';// else result would be false bit
                }
            }
            System.out.println("After and operation :");
            System.out.println(res);
 

    }
    public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
        while(true){
            andOperation();
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