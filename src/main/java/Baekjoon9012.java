package main.java;

import java.io.*;

public class Baekjoon9012 {
    static int stackSize = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        while (N > 0) {
            String str = br.readLine();
            System.out.println(bracketCheck(str));
            N--;
        }

    }
    static String bracketCheck(String str) {
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stackSize++;
            } else {
                stackSize--;
            }
            if (stackSize < 0) {
                stackSize = 0;
                return "NO";
            }
        }
        if(stackSize == 0) {
            stackSize = 0;
            return  "YES";
        } else {
            stackSize = 0;
            return "NO";
        }
    }
}
