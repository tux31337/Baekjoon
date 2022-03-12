package main.java;

import java.io.*;
import java.util.Stack;

public class Baekjoon9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<Character>();

        while (N > 0) {
            String input = br.readLine() + "\n";
            for (char ch: input.toCharArray()) {
                if(ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(' ');
                } else {
                    stack.push(ch);
                }
            }
            bw.flush();
            N--;
        }
    }

}
