package com.rnd;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TerminalProcessMain {
    private static boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");

    public static void main(String[] args) throws Exception {
        // Where we want to execute
        File location = new File("/Users/amit/Desktop/project/new/ds_algo");
        ArrayList al = new ArrayList();
        al.add("git status");
        al.add("git add .");
        al.add("git commit -a -m  'auto commit now'");
        al.add("git push");

        runCommand(location, al); // for Mac(Linux based OS) users list files

        // runCommand(location, "dir"); // For Windows users list files
    }

    public static void runCommand(File whereToRun, List<String> command) throws Exception {
        System.out.println("Running in: " + whereToRun);
        System.out.println("Command: " + command);

        ProcessBuilder builder = new ProcessBuilder();
        builder.directory(whereToRun);

        for (int i = 0; i <command.size() ; i++) {
            builder.command("sh", "-c", "git add .");
            builder.command("sh", "-c", "git commit -a -m  'auto commit now' ");
            System.out.println("process start");
            Process process = builder.start();
            System.out.println("process end");
            process.wait(1000,100);
            //process.destroyForcibly();
            System.out.println("process destroy");
        }





       /* if (isWindows) {
            builder.command("cmd.exe", "/c", command);
        } else {
            builder.command("sh", "-c", command);
        }*/


      /*  OutputStream outputStream = process.getOutputStream();
        InputStream inputStream = process.getInputStream();
        InputStream errorStream = process.getErrorStream();

        printStream(inputStream);
        printStream(errorStream);

        boolean isFinished = process.waitFor(30, TimeUnit.SECONDS);
        outputStream.flush();
        outputStream.close();

        if (!isFinished) {
            process.destroyForcibly();
        }*/
    }

    private static void printStream(InputStream inputStream) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }
    }

}