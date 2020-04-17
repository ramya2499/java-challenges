package com.tgt.igniteplus;

//program to calculate the volume of a cylinder

import java.util.*;
public class volcylinderQ2 {

        public static void main(String[] args){
            float r,h;
            Scanner in=new Scanner(System.in);
            System.out.print("enter the value of radius and height of the cylinder");
            r=in.nextFloat();
            h=in.nextFloat();
            float vol = (float)((22*r*r*h)/7);
            System.out.print("volume of the cylinder is "+vol);
        }
    }

    /*OUTPUT:
    enter the value of radius and height of the cylinder2 7
    volume of the cylinder is 88.0
     */
