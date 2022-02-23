package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();
        int[] chess = {1, 1, 2, 2, 2, 8};
        int i = 0;
        while (st.hasMoreTokens()) {
            sb.append(chess[i] - Integer.parseInt(st.nextToken())).append(" ");
            i++;
        }
        System.out.println(sb);
    }
}
