package com.rnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }

            long out_ = countSubarray(N, A);
            System.out.println(out_);

            wr.close();
            br.close();
        }
        static long countSubarray(int N, int[] A){
            // Write your code here
            int prev = -1;
            long count = 0;
            int k = -1;

            for(int i = 0;i<N;i++){
                if((A[i]&1)==0){
                    k = (i - prev - 1);

                    count += (k * (k+1))>>1;

                    prev = i;
                }
            }
            k = (N - prev - 1);

            count += (k * (k+1))>>1;

            return count;

        }
}
