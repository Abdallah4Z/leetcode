package medium.PrimeSubtractionOperation_2601;

public class Solution {
    public boolean primeSubOperation(int[] nums) {
        int prev = 0;
        boolean is_s = false;
        for (int i =0; i< nums.length ; i++){
            for (int j = nums[i]- prev -1  ; j >= 2; j--){
                if (isPrime(j)){
                    nums[i] -= j;
                    prev = nums[i];
                    is_s = true;
                    break;
                }
            }
            if (!is_s && nums[i] <= prev) return false;
            else prev = nums[i];
            is_s = false;
        }

        return true;
    }
    public boolean isPrime(int n){
        for (int i = 2; i< (int) Math.sqrt(n) +1 ; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] q = new int[]{3,4,10,15,6};
        System.out.println(new Solution().primeSubOperation(q));
    }
}
