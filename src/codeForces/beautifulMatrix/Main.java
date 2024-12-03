package codeForces.beautifulMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        for (int i =0  ; i < 5; i++){
            for (int j = 0 ; j < 5 ; j++){
                n = in.nextInt();
                if (n == 1){
                    System.out.println(Math.abs(i -2 ) + Math.abs(j - 2));
                    return;
                }
            }
        }
    }
}