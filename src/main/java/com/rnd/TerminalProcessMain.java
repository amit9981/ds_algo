package com.rnd;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class TerminalProcessMain
    {
        private static boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");

        public static void main (String[] args) throws Exception {
        // Where we want to execute
        File location = new File("/Users/amit/Desktop/project/new/ds_algo");

        runCommand(location, "git commit -a -m  'auto commit' "); // for Mac(Linux based OS) users list files

        // runCommand(location, "dir"); // For Windows users list files
    }

        public static void runCommand (File whereToRun, String command) throws Exception {
        System.out.println("Running in: " + whereToRun);
        System.out.println("Command: " + command);

        ProcessBuilder builder = new ProcessBuilder();
        builder.directory(whereToRun);

        if (isWindows) {
            builder.command("cmd.exe", "/c", command);
        } else {
            builder.command("sh", "-c", command);
        }

        Process process = builder.start();

        OutputStream outputStream = process.getOutputStream();
        InputStream inputStream = process.getInputStream();
        InputStream errorStream = process.getErrorStream();

        printStream(inputStream);
        printStream(errorStream);

        boolean isFinished = process.waitFor(30, TimeUnit.SECONDS);
        outputStream.flush();
        outputStream.close();

        if (!isFinished) {
            process.destroyForcibly();
        }
    }

        private static void printStream (InputStream inputStream) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }
    }

}