package codeForces.sakurakoAndKosuk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i =0 ; i< t ; i++){
            System.out.println(
                    (Math.abs(in.nextInt()) %2 == 1 )? "Kosuke" : "Sakurako");
        }

    }
}
