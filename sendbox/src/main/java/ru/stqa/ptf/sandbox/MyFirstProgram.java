package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

         hello("world");
         hello("Aleks");
         hello("Car");

         double len = 5;
        System.out.println("Площадь квадрата равна со стороной " + len + " = " + area(len));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со стороной " + a + " и " + b + " равна " + area(a,b));




    }

    public  static  void  hello(String somebody) {

        System.out.println("Hello," + somebody +  "!" );
    }
    public  static  double area(double l) {
        return l * l;
    }

    public  static  double  area(double a, double b) {
        return  a * b;
    }



    }
