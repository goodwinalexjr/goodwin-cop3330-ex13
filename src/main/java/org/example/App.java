package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner money = new Scanner(System.in);
        System.out.print("What is the principle amount? ");
        double principal = money.nextDouble();
        System.out.print("What is the rate? ");
        double rate = money.nextDouble();
        System.out.print("What is the number of years? ");
        int year = money.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = money.nextInt();

        double total = principal * Math.pow((1 + ((rate / 100)) / compound), (compound * year));
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("$" + principal + " invested at " + rate + "%, for " + year + " years compounded "+ compound + " times per year is $" + df.format(total) + ".");

    }
}
