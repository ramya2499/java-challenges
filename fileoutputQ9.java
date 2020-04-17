package com.tgt.igniteplus;

//to write a data to the file using FileOutputStream where example.txt file is already created/present//

import java.io.*;
public class fileoutputQ9 {

        public static void main(String[] args) {
            try{
                FileOutputStream fout=new FileOutputStream("example.txt");
                fout.write(75);
                fout.close();
                System.out.println("done");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

/*OUTPUT:
done
 */