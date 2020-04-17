package com.tgt.igniteplus;

//program to create a java file//

import java.io.*;
public class filecreateQ8 {

    public static void main(String[] args) throws IOException {
        try {
            File f=new File("example.txt");
            if(f.createNewFile())
                System.out.println("File has been created ");
            else
                System.out.println("File already exists");
        }
        catch (IOException e) {
            System.out.println("Error");
        }
    }
}

/*OUTPUT:
File has been created
 */
