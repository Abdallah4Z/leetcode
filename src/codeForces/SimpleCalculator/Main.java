package codeForces.SimpleCalculator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fn = s.nextInt();
        int sn = s.nextInt();
        System.out.println(
                fn +" + "+ sn +" = "+(fn+sn)+"\n"+
                        fn +" * "+ sn +" = "+(fn*sn)+"\n"+
                        fn +" - "+ sn +" = "+(fn-sn)
        );
    }
}