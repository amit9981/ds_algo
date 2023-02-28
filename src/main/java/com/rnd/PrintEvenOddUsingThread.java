package com.rnd;

public class PrintEvenOddUsingThread {
    int counter = 1;

    static int N;

    // Function to print odd numbers
    public void printOddNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < N) {

                // If count is even then print
                while (counter % 2 == 0) {

                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.print(counter + " ");

                // Increment counter
                counter++;

                // Notify to second thread
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < N) {

                // If count is odd then print
                while (counter % 2 == 1) {

                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.print(
                        counter + " ");

                // Increment counter
                counter++;

                // Notify to 2nd thread
                notify();
            }
        }
}
    public static void main(String[] args) {
        PrintEvenOddUsingThread printEvenOddUsingThread=new PrintEvenOddUsingThread();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                printEvenOddUsingThread.printEvenNumber();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                printEvenOddUsingThread.printOddNumber();
            }
        });
        t1.start();
        t2.start();
    }
}
class Multithread
{
    private int i = 0;
    public void increment()
    {
        i++;
    }

    public int getValue()
    {
        return i;
    }
}

class Line
{
    // if multiple threads(trains) will try to
    // access this unsynchronized method,
    // they all will get it. So there is chance
    // that Object's  state will be corrupted.
    static public void getLine()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i+" : "+Thread.currentThread().getName());
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class Train extends Thread
{
    // reference to Line's Object.
    Line line;

    Train(Line line)
    {
        this.line = line;
    }

    @Override
    public void run()
    {
        line.getLine();
    }
}

class GFG
{
    public static void main(String[] args)
    {
        // Object of Line class that is shared
        // among the threads.
        Line obj = new Line();

        // creating the threads that are
        // sharing the same Object.

        Train train1 = new Train(obj);
        Train train2 = new Train(obj);

        // threads start their execution.
        train1.start();
        train2.start();
    }
}
