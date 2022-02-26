package main.java;
import java.util.Scanner;

public class Baekjoon11729 {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 1, 3, 2);
        System.out.println(count);
        System.out.println(sb);
    }

    static void hanoi(int num, int from, int to, int other) {
        if(num == 0) {
            return;
        }
        count++;
        hanoi(num - 1, from,  other, to);
        sb.append(from).append(" ").append(to).append('\n');
        hanoi(num - 1, other, to, from);

    }
}
