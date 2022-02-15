package main.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean[] checkPrime = new boolean[b + 1];
        primeCheck(checkPrime, b);

        for (int i = a; i <= b; i++) {
            if(checkPrime[i] == false) {
                sum += i;
                min = min > i ? i : min;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }


    }
    static void primeCheck(boolean[] checkPrime, int b) {
        checkPrime[0] = true;
        checkPrime[1] = true;
        for (int i  = 2; i <= b; i++) {
            if(checkPrime[i]) continue;
            for(int j = i * i;  j <= b; j+=i) {
                checkPrime[j] = true;
            }
        }
    }
}
