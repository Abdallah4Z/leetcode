package easy.PalindromNumber_9;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0, org = x;
        while (x > 0){
            rev  = rev *10 + (x % 10);
            x /=10;
        }
        return rev == org;
    }

    public static void main(String[] args) {
        boolean sol = new Solution().isPalindrome(1234321);
        System.out.println(sol);
    }
}