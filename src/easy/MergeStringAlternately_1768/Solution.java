package easy.MergeStringAlternately_1768;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < Math.max(word1.length(), word2.length());i++){
            if(i < word1.length())
                b.append(word1.charAt(i));

            if(i < word2.length())
                b.append(word2.charAt(i));

        }
        return b.toString();
    }
    public static void main(String[] args) {
        System.out.println(new Solution().mergeAlternately("ad", "ballah"));
    }
}

