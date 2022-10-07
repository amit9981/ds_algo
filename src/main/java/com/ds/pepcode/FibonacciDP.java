package com.ds.pepcode;

public class FibonacciDP {
  /*  public static void main(String[] args) {
        int a=1;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <5 ; i++) {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
 }*/
  public static void main(String[] args) {
      System.out.println(fibMemorized(6,new int[7]));
     // System.out.println(fib(6));

  }
  public static int fib(int n){
      if(n==0||n==1){
          return n;
      }
      System.out.println("hello "+n);
      int fibnum1=fib(n-1);
      int fibnum2=fib(n-2);
      int fibnum=fibnum1+fibnum2;
      return fibnum;
  }
    public static int fibMemorized(int n,int []qb){
        if(n==0||n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        System.out.println("hello "+n);
        int fibnum1=fibMemorized(n-1,qb);
        int fibnum2=fibMemorized(n-2,qb);
        int fibnum=fibnum1+fibnum2;

        qb[n]=fibnum;
        return fibnum;
    }

}
