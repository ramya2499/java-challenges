package com.tgt.igniteplus;

// program to concatenate two strings//

import java.util.*;
public class stringconcatQ12 {

        public static void main(String[] args){
            String s1,s2;
            System.out.print("enter the first string ");
            Scanner in=new Scanner(System.in);
            s1=in.nextLine();
            System.out.print("enter the second string ");
            s2=in.nextLine();
            String s=s1+" "+s2;
            System.out.print("the new concatenated string is : "+s);
        }
    }

/*OUTPUT:
enter the first string happy
enter the second string birthday
the new concatenated string is :  happy birthday
 */