package main;

import java.util.Scanner;

public class Launcher {
    private static int timesRun = 0;
    private static void cutter(int n) {
        if (n == 1) {
            System.out.println(timesRun);
            timesRun=0;
            return;
        }
        if (n % 2 == 0) {
            cutter(n / 2);
        } else {
            timesRun++;
            cutter(n / 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            cutter(scanner.nextInt());
        }

    }
}
