package codeForces.littleGirlAndMaximumSum;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q =in.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i =0 ; i< q;i++){
            int f = in.nextInt();
            int s = in.nextInt();
            f--;
            for (;f<s;f++){
                temp[f]++;
            }
        }

        Arrays.sort(arr);
        Arrays.sort(temp);
        long sum = 0;
        for (int i =0 ; i < arr.length;i++){
            sum+= (long) arr[i] *temp[i];
        }
        System.out.println(sum);
    }
}