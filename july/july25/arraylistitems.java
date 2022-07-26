package july25;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylistitems {

    public static  ArrayList<Integer> list=new ArrayList<>();
    public static void listofnumbers() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of elements you want to enter in the list :");
        int n=scan.nextInt();
        System.out.println("Enter the elements you want to add to the list :");
        for (int i = 0; i < n; i++) {
            int number=scan.nextInt();
            list.add(number);
        }

        System.out.println("Below is the list of all elements in the list :");
        System.out.println(list);
    }

    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        while(true){
            listofnumbers();
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
