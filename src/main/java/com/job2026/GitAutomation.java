package com.job2026;
import java.io.IOException;
import java.util.Scanner;

public class GitAutomation {

        public static void main(String[] args) throws InterruptedException, IOException {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please provide message");
            String commitMsg=sc.nextLine();
            new ProcessBuilder("git", "add", ".").start();
            new ProcessBuilder("git", "commit", "-m", commitMsg).start();
            new ProcessBuilder("git", "push").start();
            System.out.println("Exit Code: " + "pushed");
        }
}
