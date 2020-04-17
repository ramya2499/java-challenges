package com.tgt.igniteplus;

// program to find the ASCII value of the character//

import java.util.Scanner;
public class asciiQ4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the character whose ASCII value is to be found ");
        char s = in.next().charAt(0);
        System.out.println("the ASCII value of " + s + " is " + (int) s);
    }
}

/* OUTPUT:
enter the character whose ASCII value is to be found A
the ASCII value of A is 65
 */