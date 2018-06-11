package co.ke.startech;

import java.util.Scanner;

public class Functions {
    int z = 100; //global variable....can be seen accross all scope
    public static void area(double h, double b) {
        double results = 0.5 * b * h;
        System.out.println(results);
    }

    public static void main(String[] args) {
        //A function is a block of code that talks to a computer instructing it what to do. A function is always followed by brackets
        System.out.println(1234); //calling a function
        Scanner S = new Scanner(System.in);//s is our variable
        System.out.println("First Number : ");
        int first = S.nextInt();

        System.out.println("Second Number : ");
        int second = S.nextInt();
        int result = first + second;
        System.out.println("Sum is " + result);

        area(60, 30);
        area(first, second);


        Functions f = new Functions();
        f.volume(15);
        f.volume(7);
        f.volume(first);
        f.volume(second);
        System.out.println("volume is"+f.volume(10));
        System.out.println(f.volume(6.55));
        double v= f.volume(5);
        System.out.println(Math.round(v));

        f.converter(10000, "USD", true);
        f.converter(25000, "EUR", false);
        f.converter(180000, "GBP", true);
        f.converter(10000, "UGX", true);



    }

    public double volume(double r) {
        double result = 4 / 3 * 22 / 7.0 * r * r * r;
        //System.out.println(result);
        return result;


    }


    public void converter(double kes, String currency, boolean rounded) {
        double result=0; //local variable
        if (currency.equals("USD")) { //if statement doesn't have a semi colon at the end
             result = kes / 104;

        } else if (currency.equals("EUR"))
        {
             result = kes / 119;
        } else if (currency.equals("GBP"))
        {
             result = kes / 135;
        }

        if (rounded ==true){
            System.out.println(currency+Math.round(result));
        }else
            {
                System.out.println(currency+result);

            }



    }

}

