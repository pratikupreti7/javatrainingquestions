package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class linearsearch {

    public static  boolean value_search(){
        System.out.println("Enter size of array :");
        Scanner scan =new Scanner(System.in);
        int size = scan.nextInt();

        int [] arr=new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }

        System.out.println("Array entered by user is :");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the target you are trying to search :");

        int target = scan.nextInt();

        return value_in_array(arr,target);
    }



//    Creating  a method for linear search

    public static  boolean value_in_array(int [] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(true){
            System.out.println(value_search());
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

