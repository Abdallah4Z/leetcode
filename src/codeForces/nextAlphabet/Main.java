package codeForces.nextAlphabet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);

        if (c!='z') System.out.println((char) (c+1));
        else System.out.println('a');
    }
}
