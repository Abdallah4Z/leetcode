package codeForces.gukiZandContest;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = in.nextInt();
        }
        for (int k : r) {
            int c = 1;
            for (int i = 0; i < r.length; i++) {
                if (r[i] > k)
                    c++;
            }
            System.out.print(c + " ");
        }
    }
}