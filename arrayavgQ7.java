package com.tgt.igniteplus;

//program to calculate the average value of the array elements//

import java.util.*;
public class arrayavgQ7 {

           public static void main(String[] args){
            int n,i,sum=0;
            float avg=0;
            int[] a=new int[20];
            Scanner in=new Scanner(System.in);
            System.out.print("enter the number of elements ");
            n=in.nextInt();
            System.out.print("enter the elements ");
            for(i=0;i<n;i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            avg=(float)sum/n;
            System.out.print("the average value of the elements is "+avg);
        }
    }

/*OUTPUT:
enter the number of elements 5
enter the elements
2
4
5
9
7
the average value of the elements is 5.4

 */