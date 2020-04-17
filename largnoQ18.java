package com.tgt.igniteplus;

//program to calculate the largest number from the given three numbers using ternary operator//

import java.util.*;
public class largnoQ18 {

        public static void main(String[] args){
            int a,b,c;
            System.out.print("enter the 3 numbers");
            Scanner in=new Scanner(System.in);
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            int big=a>b?(a>c?a:c):(b>c?b:c);
            System.out.print("the largest of the 3 numbers is "+big);
        }
    }

    /*OUTPUT:
    enter the 3 numbers 2 7 9
    the largest of the 3 numbers is 9
     */
