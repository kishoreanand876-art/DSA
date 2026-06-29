class Solution {
    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
         if(nums[i]<nums[i+1]){
            count++;
         }
         if(nums[i]==nums[i+1]){
          ans++;
         }
        }
        if(count==nums.length-1&&ans==0){
        return 2;
        }
        else if(ans==nums.length&&count==0){
            return 1;
        }
        else if(count!=nums.length&&ans>0){
            return nums.length-ans;
        }else
        return 2;
    }
}