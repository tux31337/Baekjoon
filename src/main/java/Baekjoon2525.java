package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        int remainTime = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(time);
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int sumTime = minute + remainTime;
        if(sumTime > 59) {
            int plushour = sumTime / 60;
            int remainMinute = sumTime % 60;
            hour = hour + plushour >= 24 ? hour + plushour - 24 : hour + plushour;
            System.out.println(hour + " " + remainMinute);
            return;
        }
        System.out.println(hour + " " + sumTime);

    }
}
