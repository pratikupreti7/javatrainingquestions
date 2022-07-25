package com.company;

import java.util.Scanner;

public class square_perimeter {

    public static int peri_sq(int s){
        int peri=4*s;
        return peri;
    }
    public static void main(String[] args) {

        while(true){
            Scanner scan =new Scanner(System.in);
            System.out.println("Enter the side of square :");
            int side =scan.nextInt();
            System.out.println("Perimeter of square having side "+side +" is "+peri_sq(side));
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
