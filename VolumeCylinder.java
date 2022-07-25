package com.company;

import java.util.Scanner;

public class VolumeCylinder {


    public static double volume(double radius,double height){
        double volume=(Math.PI)*radius*radius*height;
        return volume;
    }
    public static void main(String[] args) {

        while(true){
            Scanner scan =new Scanner(System.in);
            System.out.println("Please enter the radius of a Cylinder : ");
            double radius =scan.nextInt();
            System.out.println("Please enter the height of a Cylinder : ");
            double height =scan.nextInt();
            System.out.println("Volume of cylinder  having radius "+radius+" and height "+height+" is "+volume(radius,height));
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
