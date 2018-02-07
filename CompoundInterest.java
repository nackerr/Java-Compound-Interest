/**
 *This is a modified version
 * of a program that calculated
 * interest after X years. This
 * program will compute compounding
 * interest after 5 years. This
 * modification was made by Ryan Nacker.
*/


import java.text.DecimalFormat;
 
public class CompoundInterest {
   
   public static void main(String[] args) {
   
       /* Variable Declaration */
   
       double principal;     // The value of the investment.
       double rate;          // The annual interest rate.
       double finalValue;    // The final value of the investment.
       DecimalFormat finalFormat = new DecimalFormat("##,###.00"); //Will nicely format the given final value.
       
       /* Do the computations. */
       
       principal = 17000;
       rate = 0.027;
       
       finalValue = principal * java.lang.Math.pow((1 + (rate / 1)), 5);
             
       System.out.println("The interest earned is $" + finalFormat.format((finalValue - principal)));
       System.out.println("The value of the investment after 5 years is $" + finalFormat.format(finalValue));
                      
   }
      
}
