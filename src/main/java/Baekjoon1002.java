package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        int i = 0;
        StringTokenizer st;
        while(true) {
            if(i == arr.length) {
                break;
            }
            st = new StringTokenizer(arr[i]);
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int k = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append(-1).append("\n");
            } else if (k > Math.pow(r1 + r2, 2)) {
                sb.append(0).append("\n");
            } else if (k < Math.pow(r2 - r1, 2)) {
                sb.append(0).append("\n");
            } else if (k == Math.pow(r2 - r1, 2)) {
                sb.append(1).append("\n");
            } else if(k == Math.pow(r1 + r2, 2)) {
                sb.append(1).append("\n");
            } else {
                sb.append(2).append("\n");
            }
            i++;
        }
        System.out.println(sb);
    }
}
