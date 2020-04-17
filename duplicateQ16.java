package com.tgt.igniteplus;

// program to print the duplicate characters of the string//

import java.util.*;
public class duplicateQ16 {
        public static void main(String[] args){
            String str;
            System.out.print("enter the string");
            Scanner in=new Scanner(System.in);
            str=in.nextLine();
            int c=0;
            char[] input=str.toCharArray();
            System.out.println("the duplicate characters are");
            for(int i=0;i<str.length();i++) {
                for (int j = i + 1; j < str.length(); j++){
                    if (input[i] == input[j]) {
                        System.out.print(input[j]);
                        c++;
                        break;
                    }
                }
            }
        }
    }

/*OUTPUT:
enter the string psychology
the duplicate characters are
yo
 */