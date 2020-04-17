package com.tgt.igniteplus;

// program to count the number words in a string//

import java.util.*;
public class noofwordsQ13 {

        public static void main(String[] args){
            String s;
            System.out.print("enter the string ");
            Scanner in=new Scanner(System.in);
            s=in.nextLine();
            if(s==null||s.isEmpty())
                System.out.print("empty string");
            else{
                String[] words=s.split("\\s+");
                System.out.print("the number of words in "+s+" is "+words.length);
            }
        }
    }

    /*OUTPUT:
    enter the string
    empty string  */
