package july25;

import java.util.Arrays;
import java.util.Scanner;

public class diagonalof2Dmatrix {

//    public static boolean arr2D(){
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter number of  rows of matrix :");
//        int rows = scan.nextInt();
//
//        System.out.println("Enter number of  columns of matrix :");
//        int column = scan.nextInt();
//
//        if (rows!=column){
//
//            System.out.println("Please enter equal row and column for square matrix");
//            return false;
//
//        }
//       return  true;
//    }

    public static void arr(){
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter number of  rows of matrix :");
        int rows = scan.nextInt();

        System.out.println("Enter array elements:");
        int[][] arr=new int[rows][rows];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=scan.nextInt();
            }

        }

        System.out.println("Array entered by user is :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Printing only the diagonal element :");
        diagonal(arr);


    }


    public static void diagonal(int [] [] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == j || (i+j)== arr.length-1) {

                    System.out.print(arr[i][j]+" ");
                }


                else{
                    System.out.print ("-"+" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(true){
            arr();
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
