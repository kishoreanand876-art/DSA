// class Solution {
//     public int numOfSubarrays(int[] arr) {
//         List<Integer> list=new ArrayList<>();
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){
//                     sum+=arr[k];
//                 }
//                 list.add(sum);
//             }
//         }
//         int count=0;
//            for(int nums:list){
//                if(nums % 2!=0){
//                 count++;
//                }
//            }
//         return count;
//     }
// }
class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddCount = 0, prefixSum = 0;
        for(int a : arr){
            prefixSum += a;
            oddCount += prefixSum % 2;
        }
        oddCount += (arr.length - oddCount) * oddCount;
        return (int)(oddCount % 1_000_000_007);
    }
}