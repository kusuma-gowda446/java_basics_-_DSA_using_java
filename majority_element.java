import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);   // sort the array
        
        return nums[n / 2];  // return middle element
    }
}
