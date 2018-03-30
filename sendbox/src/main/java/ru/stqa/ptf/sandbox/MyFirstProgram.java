package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("Aleks");
    hello("WORLD");

    double len = 5;
    System.out.println("Площадь квадрата со стороной " + len + " равна " + area(len));

    double a = 11;
    double b = 2;
    System.out.println("Площа прямокутника зі стороною " + a + " і " + b + " равна "  + area(a, b) );

  }

  public static void hello(String somebody) {

    System.out.println("Hello " + somebody);

  }

  public static double area(double l) {
    return l * l;

  }

  public  static  double area(double a, double b) {
    return  a * b;
  }



}