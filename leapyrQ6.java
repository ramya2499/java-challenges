package com.tgt.igniteplus;

// program to check if input year is leap year or not//

import java.util.*;
public class leapyrQ6 {

        public static void main(String[] args){
            int year;
            Scanner in=new Scanner(System.in);
            System.out.print("enter the year to be checked");
            year=in.nextInt();
            if((year%4==0 && year%100!=0)||(year%400==0))
                System.out.print(year+" is a leap year");
            else
                System.out.print(year+" is not a leap year");
        }
}
/* OUTPUT:
enter the year to be checked  2012
2012 is a leap year
 */
