package com.job2026;
import java.io.IOException;
import java.util.Scanner;

public class GitAutomation {

        public static void main(String[] args) throws InterruptedException, IOException {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please provide commit message");
            String commitMsg=sc.nextLine();
           Process add= new ProcessBuilder("git", "add", ".").start();
            Process commit = new ProcessBuilder("git", "commit", "-m", commitMsg)
                    .inheritIO()
                    .start();
            commit.waitFor();

            Process push = new ProcessBuilder("git", "push")
                    .inheritIO()
                    .start();

            int exitCode = push.waitFor();
            cleanUp(add,commit,push);
            System.out.println("Exit Code: " + "pushed");
        }
    private static void cleanUp(Process p1, Process p2, Process p3) throws InterruptedException {
        System.out.println("process cleanUp Started : ");
        p1.destroyForcibly();
        p2.destroyForcibly();
        p3.destroyForcibly();
        System.out.println("process cleanUp End : ");
    }
}
