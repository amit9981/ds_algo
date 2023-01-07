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
        ArrayList commands = new ArrayList();
        commands.add("git add .");
        commands.add("git commit -a -m  'auto'");
        commands.add("git push");

        runCommand(location, commands); // for Mac(Linux based OS) users list files
    }

    public static void runCommand(File whereToRun, List<String> command) throws Exception {
        System.out.println("Running in: " + whereToRun);
        System.out.println("Command: " + command);
        System.out.println("git add started : " + command.get(0));
        Process p1 = Runtime.getRuntime().exec(command.get(0), null, whereToRun);
        System.out.println("commit started : " + command.get(1));
        Process p2 = Runtime.getRuntime().exec(command.get(1), null, whereToRun);
        System.out.println("git push started : " + command.get(2));
        Process p3 = Runtime.getRuntime().exec(command.get(2), null, whereToRun);
        boolean isFinished1 = p1.waitFor(50, TimeUnit.SECONDS);
        boolean isFinished2 = p2.waitFor(50, TimeUnit.SECONDS);
        boolean isFinished3 = p3.waitFor(30, TimeUnit.SECONDS);
        if (isFinished1 && isFinished2 && isFinished3) {
            cleanUp(p1, p2, p3);
        }
    }

    private static void cleanUp(Process p1,Process p2,Process p3) throws InterruptedException {
        System.out.println("process cleanUp Started : " );
            p1.destroyForcibly();
            p2.destroyForcibly();
            p3.destroyForcibly();

        System.out.println("process cleanUp End : " );
    }

}