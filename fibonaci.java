package com.company;
import java.util.Scanner;
public class fibonaci {

    public static void fibo(int num){
        int a=0;
        int b=1;

        for(int i=0;i<num;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {


        while(true){

            Scanner scan=new Scanner(System.in);
            System.out.println("Enter how manny  fibonaci numbers you want: ");
            int nums=scan.nextInt();
            fibo(nums);
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
