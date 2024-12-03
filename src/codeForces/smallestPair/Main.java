package codeForces.smallestPair;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums ;
        for (int i =0 ; i < n ; i++){
            nums = new int[in.nextInt()];
            for (int j = 0 ; j < nums.length ; j++){
                nums[j] = in.nextInt();
            }

            int min  = 999999999;

            for (int f = 0; f < nums.length; f++) {
                for (int j = f + 1; j < nums.length; j++) {
                    int r = nums[f] + nums[j] + (j - f);
                    if (r < min) {
                        min = r;
                    }
                }
            }

            System.out.println(min);



        }
    }
}
