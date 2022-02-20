package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9020 {
    static boolean[] primeCheckArray = new boolean[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int first = n / 2;
            int second = n / 2;
            calculatePrimeNumber();
            while (true) {
                if(!primeCheckArray[first] && !primeCheckArray[second]) {
                    System.out.println(first + " " + second);
                    break;
                }
                first--;
                second++;
            }
        }

    }
    static void calculatePrimeNumber() {
        primeCheckArray[0] = true;
        primeCheckArray[1] = true;
        for(int i = 2; i <= Math.sqrt(primeCheckArray.length); i++) {
            if(primeCheckArray[i]) continue;
            for(int j = i * i; j < primeCheckArray.length; j += i) {
                primeCheckArray[j] = true;
            }
        }
    }
}
