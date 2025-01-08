package easy.CountPerfixAndSuffixPairsI_3042;

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i =0 ; i< words.length; i++){
            for(int j = i+1 ; j < words.length; j++){
                if(isPrefixAndSuffix(words[i], words[j])) count++;
            }
        }
        return count;
    }
    public boolean isPrefixAndSuffix(String str1, String str2){
        if(str1.length() > str2.length()) return false;
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}