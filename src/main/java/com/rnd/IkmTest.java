package com.rnd;

 public class IkmTest {
    private IkmTest() {
        this(10);
    }
    public IkmTest(int data) {
        this.data = data;
    }
    public void display() {
        class Decrementer {
            public void decrement () {
                data--;
            }
        }
        Decrementer d = new Decrementer();
        d.decrement();
        System.out.println("data = " + data);
    }

    private int data;

    public static void main (String [] args) {
        int data = 0;
        IkmTest t = new IkmTest();
        t.display();
        System.out.println("data = " + data);
    }
    class B extends IkmTest{
        public static void main(String[] args) {
            IkmTest b= new IkmTest();
        }

    }
}
