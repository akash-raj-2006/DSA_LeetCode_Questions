class Solution {
    public int[] rearrangeArray(int[] nums) {
      int pos = 0;
      int neg = 1;
     int n = nums.length;
      int[] result = new int[n];
      for(int num:nums){
        if(num > 0){
            result[pos] = num;
            pos += 2;
        }
        else {
                result[neg] = num;
                neg +=2;
        }
      }
        return result;
    }
}