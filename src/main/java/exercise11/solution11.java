package exercise11;

import java.util.Scanner;
import java.text.DecimalFormat;

public class solution11 {

    private static DecimalFormat df = new DecimalFormat("0.00");

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("How many euros are you exchanging? ");
            double c = sc.nextDouble();

            System.out.print("What is the exchange rate? ");
            double r = sc.nextDouble();
            double converted = c*r;

            System.out.println(c+" euros at an exchange rate of "+r+" is: " + (df.format(converted)) + " U.S dollars.");

        }
    }
/* psuedocode: wacky silly numbers. this follows suit with most other code.
first we import both the scanner function and the decimal format. first, the
df function is called so that the final answer is rounded up to the nearest
cents. after that the main body is created and an instance of the scanner
function is made to read in the values for the amount of euros (held in "c")
and the exchange rate (held in "r"). the code outputs the currency and the
rate and then uses these values to calculate the converted currency (held in
"converted"). the code finally prints the final answer and uses the decimal
format function to round it to the closest cent.
*/