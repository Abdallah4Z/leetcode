package codeForces.summitionFrom1toN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println((n * (n+1))/2);
    }
}