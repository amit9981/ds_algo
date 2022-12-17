package com.java.jdk9;

import java.util.stream.Collectors;

public class ProcessAPI {
    public static void main(String[] args) {


        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Current Process Id: = " + currentProcess.pid());
        System.out.println("Current Process Id: = " + ProcessHandle.allProcesses().collect(Collectors.toList()));
        System.out.println("Current Process Id: = " + ProcessHandle.Info.class);
        System.out.println("Current Process Id: = " + ProcessHandle.of(currentProcess.pid()));

    }
}