package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cordinate1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] cordinate2 = {Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken())};
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int[] cordinate3 = {Integer.parseInt(st3.nextToken()), Integer.parseInt(st3.nextToken())};
        int x = 0;
        int y = 0;
        if(cordinate1[0] == cordinate2[0]) {
            x = cordinate3[0];
        } else if(cordinate1[0] == cordinate3[0]) {
            x = cordinate2[0];
        } else {
            x = cordinate1[0];
        }

        if(cordinate1[1] == cordinate2[1]) {
            y = cordinate3[1];
        } else if(cordinate1[1] == cordinate3[1]) {
            y = cordinate2[1];
        } else {
            y = cordinate1[1];
        }

        System.out.println(x + " " + y);
    }
}
