package com.company;

                            /*

                            Q.9

                             *****
                             ****
                             ***
                             **
                             *

                            * */
public class star3 {

    public static void star(){
        for (int i= 4; i>=0 ; i--)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        star();
    }
}
