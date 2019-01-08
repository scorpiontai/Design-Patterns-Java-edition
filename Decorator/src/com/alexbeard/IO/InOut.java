package com.alexbeard.IO;

import java.io.*;

public class InOut {
    public static void main(String[] args) {
        int c;

        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("./text.txt")));
            while ((c = in.read())>= 0){
                System.out.println((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
