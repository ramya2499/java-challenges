package com.tgt.igniteplus;

//program to read two string user input and check if first contains the second.//

import java.util.*;
public class readstringsQ14 {

        public static void main(String[] args) {
            String s1, s2;
            System.out.print("enter the main string ");
            Scanner in = new Scanner(System.in);
            s1 = in.nextLine();
            System.out.print("enter the sub string ");
            s2 = in.nextLine();
            if (s1.contains(s2))
                System.out.print(s2 + " is present in " + s1);
            else
                System.out.print(s2 + " is not present in " + s1);
        }
    }

/*OUTPUT:
enter the main string friendship
enter the sub string ship
ship is present in friendship
 */