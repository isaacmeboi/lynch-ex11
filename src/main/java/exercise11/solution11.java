/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Isaac Lynch
 */

package exercise11;

import java.text.DecimalFormat;
import java.util.Scanner;


class ExchangeRate {
    double c;
    double r;

    private static DecimalFormat df = new DecimalFormat("0.00");

    public void scn() {
        System.out.print("How many euros are you exchanging? ");
        Scanner sc = new Scanner(System.in);
        this.c = sc.nextDouble();
        System.out.print("What is the exchange rate? ");
        this.r = sc.nextDouble();
    }

    public void prt() {
        System.out.println(c + " euros at an exchange rate of " + r + " is");
        double converted = c * r;
        System.out.println(df.format(converted) + " U.S dollars.");
    }
}
    public class solution11 {
        public static void main(String[] args) {
            ExchangeRate ca = new ExchangeRate();
            ca.scn();
            ca.prt();

        }
    }
/* haha, let's just say i can't read rules very well and a lot of these exercises will need to be redone.
but hey! more commits am i right! :,). anyway, this code starts with importing the scanner function as well
as the decimal function which will help in rounding the number to the closest cent. then,a class called
"ExchangeRate" holds the double values for the rates "r" and the amount of money, currency "c". after that
a public void is maid called "scn" which will scan in the user's inputs for the outputted prompts. public
void prt then prints out the rate and money accordingly and then calculates the converted price by multiplying
the two numbers. the main body then runs these two public voids before ending. it's 2 am, and now i gotta fix
the rest.
 */