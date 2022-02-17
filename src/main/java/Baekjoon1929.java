package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean[] primeCheckArray = new boolean[b+ 1];
        calculatePrimeNumber(primeCheckArray);
        for(int i = a; i < primeCheckArray.length; i++) {
            if(primeCheckArray[i] == false) {
                System.out.println(i);
            }
        }
    }

    static void calculatePrimeNumber(boolean[] primeCheckArray) {
        primeCheckArray[0] = true;
        primeCheckArray[1] = true;
        for (int i = 2; i <= Math.sqrt(primeCheckArray.length); i++) {
            if(primeCheckArray[i]) continue;
            for (int j = i * i; j < primeCheckArray.length; j+=i) {
                primeCheckArray[j] = true;
            }
        }
    }
}
