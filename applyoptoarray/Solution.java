package applyoptoarray;

import java.util.Arrays;

class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;


        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }


        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                if (i != pos) {
                    int temp = nums[i];
                    nums[i] = nums[pos];
                    nums[pos] = temp;
                }
                pos++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] test1 = {1, 2, 2, 1, 1, 0};
        System.out.println("Input: " + Arrays.toString(test1));
        int[] result1 = solution.applyOperations(test1);
        System.out.println("Output: " + Arrays.toString(result1));

        int[] test2 = {0,1};
        System.out.println("Input: " + Arrays.toString(test2));
        int[] result2 = solution.applyOperations(test2);
        System.out.println("Output: " + Arrays.toString(result2));
    }
}

