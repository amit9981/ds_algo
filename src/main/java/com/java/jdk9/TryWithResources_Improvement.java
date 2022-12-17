package com.java.jdk9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources_Improvement {
    //Java 7 try with resources
    void testARM_Before_Java9() throws IOException{
        BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
        try (BufferedReader reader2 = reader1) {
            System.out.println(reader2.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   // Java 9
    void testARM_Java9() throws IOException{
        BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
        try (reader1) {
            System.out.println(reader1.readLine());
        }
    }

}
