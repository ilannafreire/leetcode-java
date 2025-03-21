package minoperations;


public class Solution {
    public int minOperations(int[] nums) {
        int operationsCount = 0;

        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == 0) {
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                operationsCount++;
            }
        }

        if (nums[nums.length - 2] == 0 || nums[nums.length - 1] == 0) {
            return -1;
        }

        return operationsCount;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 1};
        int result1 = solution.minOperations(nums1);
        System.out.println("Case 1: " + result1);

        int[] nums2 = {0, 0, 0};
        int result2 = solution.minOperations(nums2);
        System.out.println("Case 2: " + result2);

        int[] nums3 = {1, 0, 0};
        int result3 = solution.minOperations(nums3);
        System.out.println("Case 3: " + result3);

        int[] nums4 = {1,1,1,1,1};
        int result4 = solution.minOperations(nums4);
        System.out.println("Case 4: "+ result4);

        int[] nums5 = {0,0,1,0,0,1,1,1,0};
        int result5 = solution.minOperations(nums5);
        System.out.println("Case 5: " + result5);
    }
}