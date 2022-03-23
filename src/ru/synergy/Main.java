package ru.synergy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Rect rect = new Rect(); // обьявленение переменной класса Rect
        rect.height = 10;
        rect.width = 15;
        rect.nameOfRect = "I'am Rect";


        Rect rect1 = new Rect(); // обьявленение переменной класса Rect
        rect1.height = 7;
        rect1.width = 6;
        rect1.nameOfRect = "I'am Rect1";


        Rect rect3 = new Rect(); // обьявленение переменной класса Rect
        rect3.height = 11;
        rect3.width = 4;
        rect3.nameOfRect = "I'am Rect3";


      /*  System.out.println(rect == rect1);
        System.out.println(rect1);
        rect1 = rect;
        System.out.println(rect == rect1);
        System.out.println(rect1);*/


      /*  System.out.println(rect.getArea());
        System.out.println(rect1.getArea());
        System.out.println(rect3.getArea());

        rect3.mignify( 1.5);
        System.out.println(rect3.getArea());*/

        /*Point point1 = new Point();
        Point point2 = new Point();

        point1.input();
        System.out.println(point1);

        point2.input();
        System.out.println(point2);

        System.out.println(point1.getDistance(point2));

        System.out.println("Start moving the point");
        point1.move(100, 120);
        System.out.println(point1);
        System.out.println(point1.getDistance(point2));*/

        Double number = Double.valueOf(10.0);
        double numberCopy = number.doubleValue();
        number.toString();
        String a = "156";
        Integer integer = Integer.parseInt(a);
        int c = integer; // автораспоковка
        integer = c; // автоупоковка



    }

}
