package com.company;


import java.util.Scanner;

class Shape {

    public void calculateArea(int a, int b){

    }

}

  class Circle extends Shape {

    public void calculateArea(int r){
        System.out.println("Area of the circle: " + 3.14 * (r * r));
    }

}

  class Triangle extends Shape {

    public void calculateArea(int b, int h){
        System.out.println("Area of the triangle: " + 0.5 * (b * h));
    }

}

 class Rectangle extends Shape {

    public void calculateArea(int l, int w){
        System.out.println("Area of the rectangle: " + (l * w));
    }

}

  class IsoscelesTriangle extends Triangle {

    public void calculateArea(int b, int h){
        System.out.println("Area of the isosceles triangle: " + 0.5 * (b * h));
    }

}

 class Parallelogram extends Shape {

    public void calculateArea(int b, int h){
        System.out.println("Area of the parallelogram: " + (b * h));
    }

}

 class Rhombus extends Parallelogram {

    public void calculateArea(int d1, int d2){
        System.out.println("Area of the rhombus: " + 0.5 * (d1 * d2));
    }

}

  class EquilateralTriangle extends IsoscelesTriangle {

    public void calculateArea(int s){
        System.out.println("Area of the equilateral triangle: " + Math.sqrt(3) / 4 * (s * s));
    }





}

public class  Main{

    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);

        System.out.println("Enter the radius of circle :");
        int r=scan.nextInt();
        Circle cl=new Circle();
        cl.calculateArea(r);

        System.out.println("Enter the length and width for Rectangle :");
        int length=scan.nextInt();
        int width=scan.nextInt();
        Rectangle t=new Rectangle();
        t.calculateArea(length,width);

        System.out.println("Enter the base and height for triangle :");
        int base=scan.nextInt();
        int height=scan.nextInt();
        Triangle tr=new Triangle();
        tr.calculateArea(base,height);


        System.out.println("Enter the base and height for IsoscelesTriangle :");
        int base1=scan.nextInt();
        int height1=scan.nextInt();
        IsoscelesTriangle is=new IsoscelesTriangle();
        is.calculateArea(base1,height1);


        System.out.println("Enter the base and height for Parallelogram :");
        int base2=scan.nextInt();
        int height2=scan.nextInt();
        Parallelogram pl=new Parallelogram();
        pl.calculateArea(base2,height2);


        System.out.println("Enter the base and height for Rhombus :");
        int base3=scan.nextInt();
        int height3=scan.nextInt();
        Rhombus rm=new Rhombus();
        rm.calculateArea(base3,height3);




        System.out.println("Enter the base for Equilateral Triangle :");
        int base4=scan.nextInt();
        EquilateralTriangle et =new EquilateralTriangle();
        et.calculateArea(base4);


    }
}
