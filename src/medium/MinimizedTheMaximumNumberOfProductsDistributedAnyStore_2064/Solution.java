package medium.MinimizedTheMaximumNumberOfProductsDistributedAnyStore_2064;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        if(n == 1 ) return quantities[0];
        if (quantities.length == 1) return (int) Math.ceil((double) quantities[0]/n);

        long sum = 0;
        for (int i : quantities){
            sum += i;
        }
        int num = (int) Math.ceil((double) sum/n);
        for (int i =0 ; i< quantities.length; i++){
            if (quantities[i] <= num) {
                quantities[i] = -1;
                n--;
            }
        }

        sum = 0;
        for (int quantity : quantities) {
            if (quantity != -1)
                sum += quantity;

        }
        return (int)(Math.ceil((double) sum/ n));
    }


    public static void main(String[] args) {
        int x = new Solution().minimizedMaximum(7, new int[]{3, 2, 32, 43, 3});
        System.out.println(x);

    }
}
