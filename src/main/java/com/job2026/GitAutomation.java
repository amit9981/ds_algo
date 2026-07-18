package com.job2026;
import java.io.IOException;
import java.util.Scanner;

public class GitAutomation {

        public static void main(String[] args) throws InterruptedException, IOException {
            new ProcessBuilder("git", "add", ".").start();

            Process commit = new ProcessBuilder("git", "commit", "-m", "commitMsg")
                    .inheritIO()
                    .start();
            commit.waitFor();

            Process push = new ProcessBuilder("git", "push")
                    .inheritIO()
                    .start();

            int exitCode = push.waitFor();

            System.out.println("Exit Code: " + "pushed");
        }
}
