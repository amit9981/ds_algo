package com.job2026;
import java.io.IOException;

public class GitAutomation {

        public static void main(String[] args) throws InterruptedException, IOException {
            /*ProcessBuilder processBuilder = new ProcessBuilder(
                    "git", "commit", "-m", "Initial Commit"
            );

            processBuilder.inheritIO();
            Process process = processBuilder.start();
            int exitCode = process.waitFor();*/

            new ProcessBuilder("git", "add", ".").start();
            new ProcessBuilder("git", "commit", "-m", "Commit from Java").start();
            new ProcessBuilder("git", "push").start();
            System.out.println("Exit Code: " + "pushed");
        }
}
