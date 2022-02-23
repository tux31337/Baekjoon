package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String str2 = br.readLine();

        StringTokenizer st;
        st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int ab = a * b;

        st = new StringTokenizer(str2);

        while (st.hasMoreTokens()) {
            sb.append(Integer.parseInt(st.nextToken()) - ab).append(" ");
        }
        System.out.println(sb);
    }
}
