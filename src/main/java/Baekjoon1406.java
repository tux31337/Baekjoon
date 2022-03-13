package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon1406 {
    public static void main(String[] args) throws IOException {
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for(char ch: str.toCharArray()) {
            leftStack.push(ch);
        }
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String inputValue = br.readLine();
            char command = inputValue.charAt(0);
            switch (command) {
                case 'L':
                    if(!leftStack.empty()) {
                        rightStack.push(leftStack.peek());
                        leftStack.pop();
                    }
                    break;
                case 'D':
                    if(!rightStack.empty()) {
                        leftStack.push(rightStack.peek());
                        rightStack.pop();
                    }
                    break;
                case 'B':
                    if(!leftStack.empty()) {
                        leftStack.pop();
                    }
                    break;
                default:
                    leftStack.push(inputValue.charAt(2));
                    break;
            }
        }

        while (!leftStack.empty()) {
            rightStack.push(leftStack.peek());
            leftStack.pop();
        }
        while (!rightStack.empty()) {
            sb.append(rightStack.peek());
            rightStack.pop();
        }

        System.out.println(sb);
    }
}
