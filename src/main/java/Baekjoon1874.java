package main.java;

import java.io.*;
import java.util.Stack;

public class Baekjoon1874 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        Stack<Integer> stack =  new Stack<>();
//
//        int N = Integer.parseInt(br.readLine());
//
//        int stackValue = 0;
//
//        while (N-- > 0) {
//            int value = Integer.parseInt(br.readLine());
//
//            if(value > stackValue) {
//                for(int i = stackValue + 1; i <= value; i++) {
//                    stack.push(i);
//                    sb.append('+').append('\n');
//                }
//                stackValue = value;
//            } else if(stack.peek() != value) {
//                System.out.println("NO");
//                System.exit(0);
//            }
//            stack.pop();
//            sb.append('-').append('\n');
//        }
//        System.out.println(sb);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack =  new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int k = 0;
        while (N > 0) {
            int a = Integer.parseInt(br.readLine());
            if (a > k) {
                while (a > k) {
                    stack.push(++k);
                    sb.append('+').append('\n');
                }
                stack.pop();
                sb.append('-').append('\n');

            } else {
                boolean found = false;
                if(!stack.isEmpty()) {
                    int top = stack.peek();
                    stack.pop();
                    sb.append('-').append('\n');
                    if(a == top) {
                        found = true;
                    }
                }
                if(!found) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
            N--;
        }
        System.out.println(sb);
    }
}
