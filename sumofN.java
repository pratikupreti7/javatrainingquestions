package com.company;

import java.util.Scanner;

public class sumofN {

    public static  int sum(int n){
        int sum=0;
        for (int i =1; i <=n; i++) {
            sum=sum+i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        while(true){
            System.out.println("Enter the number of terms :");
            int n=scan.nextInt();

            System.out.println("Sum of first "+n+" numbers are :");
            System.out.println(sum(n));
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
