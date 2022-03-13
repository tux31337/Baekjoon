package main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1158 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int cnt = 0;
        Queue<Integer> queue = new LinkedList<>();

        sb.append('<');
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            int a = queue.poll();
            cnt++;
            if(cnt != A) {
                queue.offer(a);
            } else {
                cnt = 0;
                sb.append(a).append(", ");
            }
        }
        sb.append(queue.poll()).append('>');

        System.out.println(sb);









    }
}
