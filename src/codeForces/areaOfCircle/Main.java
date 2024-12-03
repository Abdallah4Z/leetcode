package codeForces.areaOfCircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        System.out.printf("%.9f", 3.141592653 * (r * r));
    }
}