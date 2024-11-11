package medium.PrimeSubtractionOperation_2601;

public class Solution {
    public boolean primeSubOperation(int[] nums) {
        int prev = 0;
        boolean is_p = false;
        /*
        loop for all numbers and find the largest prime number you can subtract it from the current number
        Find the largest prime less than (current number - previous number - 1) to ensure the array remains
        sorted and no value becomes 0 after subtraction
         */
        for (int i =0; i< nums.length ; i++){
            for (int j = nums[i]- prev -1  ; j >= 2; j--){
                if (isPrime(j)){
                    nums[i] -= j;
                    prev = nums[i];
                    is_p = true;
                    break;
                }
            }
            // if current number == previous number or bigger than it
            // there is no need to continue checking if we can sort the array or not
            if (!is_p && nums[i] <= prev) return false;
            else prev = nums[i];
            is_p = false;
        }

        return true;
    }

    // check if number is prime : n is prime if it has reminders for all number from 2 (the smallest prime number) to sqrt(n) +1
    // there is no need to check for nums > sqrt(n) + 1
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
