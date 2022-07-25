package com.company;

import java.util.Scanner;

/*

                         *
                         **
                         ***
                         ****
                         *****
                         ****
                         ***
                         **
                         *
*/
public class star4 {

    public static void star(){
        int j, i = 0;

        while(i < 5 )
        {
            j = 0 ;

            while( j <= i )
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        i = 5 - 1;
        while (i >= 0)
        {
            j = 0 ;
            while ( j <= i - 1 )
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }




    public static void main(String[] args) {
        star();
    }


}
