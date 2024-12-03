package codeForces.mikeAndPlindrome;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int pos = 0;
        boolean possible = true;
        int n = s.length();
        for (int p = 0; p < n / 2; p++) {
            if (s.charAt(p) != s.charAt(n - 1 - p)) {
                if (pos == 0) {
                    pos ++;
                } else {
                    possible = false;
                    break;
                }
            }
        }
        System.out.println((!possible || (pos == 0 && n % 2 == 0)) ? "NO" : "YES");
    }
}