package codeForces.Difference;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),b = s.nextInt(),c = s.nextInt(), d = s.nextInt();
        System.out.println(
                "Difference = "+ ((a*b)-(c*d))
        );
    }
}