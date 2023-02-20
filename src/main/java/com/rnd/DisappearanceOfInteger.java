package com.rnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DisappearanceOfInteger {
    public static void main(String[] args) {

        FastScanner in = new FastScanner(System.in);
        int T = in.nextInt();
        for(int t=0; t< T; t++) {
            int N = in.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++)arr[i] = in.nextInt();
            int count = 0;
            for(int i=0;i<N;i++) {
                for(int j=i; j<N; j++) {
                    if(arr[j] == arr[i])count++;
                }
            }
            System.out.println(count);
        }
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {st = new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {str = br.readLine();} catch (IOException e) {e.printStackTrace();}
            return str;
        }
        void close(){
            try{br.close();	}catch(IOException ioe){ioe.printStackTrace();}

        }
    }
}
