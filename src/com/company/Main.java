package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            FileWriter file1 = new FileWriter("test1.txt",true);
            PrintWriter pw = new PrintWriter(file1);
            for (int i = 0; i <10 ; i++) {
                pw.println("hello world"+i);
                

            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

