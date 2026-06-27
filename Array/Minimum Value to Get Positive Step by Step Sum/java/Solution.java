class Solution {
    public int minStartValue(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length;i++){
          if(j+nums[i]<=1){
            j++;
            i=0;
          }
        }
        return j;
    }
}