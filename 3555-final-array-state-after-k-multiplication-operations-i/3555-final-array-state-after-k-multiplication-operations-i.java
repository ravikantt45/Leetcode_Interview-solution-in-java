class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
         for(int i=0;i<k;i++){
            int smallest = Integer.MAX_VALUE;
             int idx = -1;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<smallest){
                    smallest = nums[j];
                    idx = j;
            }
            }
            nums[idx] = nums[idx]*multiplier;
        }
        return nums;
        
    }
}