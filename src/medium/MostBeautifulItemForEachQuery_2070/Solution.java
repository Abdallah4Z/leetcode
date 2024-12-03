package medium.MostBeautifulItemForEachQuery_2070;

import java.util.Arrays;
class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n = queries.length;
        int[] ans = new int[n];

        int[][] qi = new int[n][2];
        for (int i = 0; i < n; i++) {
            qi[i][0] = queries[i];
            qi[i][1] = i;
        }

        Arrays.sort(qi, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        int maxBeauty = 0;
        int itemIndex = 0;

        for (int i = 0; i < n; i++) {
            int currQueryIndex = qi[i][1];
            int currPrice = qi[i][0];

            while (itemIndex < items.length && items[itemIndex][0] <= currPrice) {
                maxBeauty = Math.max(maxBeauty, items[itemIndex][1]);
                itemIndex++;
            }
            ans[currQueryIndex] = maxBeauty;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] c = {{1,2},{3,2},{2,4},{5,6},{3,5}};
        int[] q = {1,2,3,4,5,6};
        int[] i = new Solution().maximumBeauty(c, q);
        System.out.println(Arrays.toString(i));
    }
}
