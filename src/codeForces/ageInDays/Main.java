package codeForces.ageInDays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        System.out.println( (d/360) + " years\n"+ ((d % 365) / 30)+ " months\n"+ ((d % 365) % 30)+" days" );
    }
}