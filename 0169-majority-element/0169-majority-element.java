class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] != candidate && count == 0) {
                candidate = nums[i];
                count++;
            } else if(nums[i] != candidate && count != 0) {
                count--;
            } else if(nums[i] == candidate) {
                count++;
            }
        }
        return candidate;
    }
}