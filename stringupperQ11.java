package com.tgt.igniteplus;

// program to convert the string totally to uppercase//

import java .util.*;
public class stringupperQ11 {

        public static void main(String[] args){
            String s;
            System.out.print("enter the string to be converted ");
            Scanner in=new Scanner(System.in);
            s=in.nextLine();
            String upper=s.toUpperCase();
            System.out.print("the converted string is "+upper);
        }
    }

/*OUTPUT:
enter the string to be converted happy
the converted string is HAPPY
 */