package com.tgt.igniteplus;

//program to check if the given number is a perfect square(whole numbers only)//

import java.util.*;
public class perfsqrQ5 {

        public static void main(String[] args){
            int num;
            Scanner in=new Scanner(System.in);
            System.out.print("enter the number to be checked");
            num=in.nextInt();
            int temp=(int) Math.sqrt(num);
            if(temp*temp==num)
                System.out.print(num+" is a perfect square ");
            else
                System.out.print(num+" is not a perfect square ");
        }
    }

    /*OUTPUT:
    enter the number to be checked 9
    9 is a perfect square
     */
