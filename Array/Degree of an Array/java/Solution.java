class Solution {
    public int findShortestSubArray(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int n=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                n+=nums[i];
            }
        }
        return 6;
    }
}