class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0]; int max = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(min > nums[i]){
                min = nums[i];
            } else 
                if(max < nums[i]){
                    max = nums[i];
                }
        }
        Set<Integer> set = new HashSet<>();
    for (int x : nums) {
        set.add(x);
    }
     List<Integer> ans = new ArrayList<>();
    for (int i = min + 1; i < max; i++) {
        if (!set.contains(i)) {
            ans.add(i);
        }
    }
    return ans;
    }
}