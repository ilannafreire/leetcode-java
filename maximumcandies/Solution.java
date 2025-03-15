package maximumcandies;

 public class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 0;
        int right = 0;


        for (int candy : candies) {
            right = Math.max(right, candy);
        }

        int result = 0;


        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == 0) {

                if (k > getTotalCandies(candies)) {
                    result = 0;
                    break;
                } else {
                    left = mid + 1;
                    continue;
                }
            }

            if (canAllocate(candies, k, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private boolean canAllocate(int[] candies, long k, int mid) {
        long count = 0;

        for (int candy : candies) {
            count += candy / mid;
        }

        return count >= k;
    }

    private long getTotalCandies(int[] candies) {
        long total = 0;

        for (int candy : candies) {
            total += candy;
        }

        return total;
    }
}
