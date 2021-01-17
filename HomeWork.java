package ru.geekbrains.lesson1;

public class HomeWork {


    public static void main(String[] args) {
        //System.out.println(getResult(2.3f,4.5f,6.4f, 8.5f));
        //System.out.println(btw10n20(20, 1));
        //System.out.println(negative(-5));
        //System.out.println(pozNeg(-3));
        //System.out.println(str("Vlad!"));
        //System.out.println(isLeap(2000));


      /* ex 2

        byte a = 01;
        short b = 02;
        int c = 03;
        long d = 04;
        float e = 05.4f;
        double f = 78.32;
        char g = 'f';
        boolean h = true;

      */

    }
        //ex 3

    public static float getResult(float a, float b, float c, float d) {

        float result = a * (b + (c / d));

        return result;

    }
        // ex 4

    public static int btw10n20(int a, int b) {

        Boolean bool = true;
        int summ = a + b;
        if (summ >= 10 && summ <= 20) {
            System.out.println(bool);
        } else {
            System.out.println(!bool);
        }
        return summ;
    }
        //ex 5

    public static int negative(int a) {

        String strN = "Negative";
        String strP = "Positive";
        if (a < 0) {
            System.out.println(strN);
        } else {
            System.out.println(strP);
        }
        return a;
    }
        //ex 6

    public static int pozNeg(int a) {
        Boolean bool = true;
        if(a < 0){
            System.out.println(bool);
        } else{
            System.out.println(!bool);
        }
        return a;
    }
        //ex 7

    public static String str(String name) {
        System.out.print("Привет ");
        return name;
    }
        //ex 8

    public static int isLeap(int year){
        if(year %4 == 0 && year %100 != 0 || year %400 == 0) {
            System.out.println("Is leap");
        } else{
            System.out.println("Isn't leap");
        }
        return year;
    }

}
