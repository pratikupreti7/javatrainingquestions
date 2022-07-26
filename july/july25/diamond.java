package july25;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("enter the number of row for full diamond: ");
        int n= scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }

        for(int i=n-1;i>0;i--)
        {
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=2*i-1;k>0;k--){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}

