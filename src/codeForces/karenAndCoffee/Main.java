package codeForces.karenAndCoffee;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(), q = in.nextInt();
        int[] temps  = new int[200001];
        for (int i =0 ; i < n  ;i ++){
            int f = in.nextInt();
            int s = in.nextInt();
            for (;f<=s;f++){
                temps[f]++;
            }
        }
        for (int i =1 ; i < temps.length ; i++){
            if (temps[i]< k)
                temps[i] = 0;
        }

        //q
        for (int i =0 ; i < q  ;i ++){
            int c = 0;
            int f = in.nextInt();
            int s = in.nextInt();
            for (;f<=s;f++){
                if (temps[f] >= k)
                    c++;
            }
            System.out.println(c);
        }
    }
}