package arrays;

public class Range_sum_query {

    public static void main(String[] args) {
        // Initialize the nums array
        int[] nums = {-2, 0, 3, -5, 2, -1};
        
        // Create the NumArray object
        NumArray numArray = new NumArray(nums);
        
        // Test sumRange method
        System.out.println(numArray.sumRange(0, 2)); // Output: 1
        System.out.println(numArray.sumRange(2, 5)); // Output: -1
        System.out.println(numArray.sumRange(0, 5)); // Output: -3
    }
}

class NumArray {
    private int[] prefixSum;

    // Constructor to initialize the prefix sum array
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
    }

    // Method to return the sum of the range [left, right]
    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        } else {
            return prefixSum[right] - prefixSum[left - 1];
        }
    }
}
