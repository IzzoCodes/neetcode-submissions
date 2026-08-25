class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Two loops as i for outer number and j for inner number to check the target
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                // To check if the number i and number j is equal or not if so then  check inside the value if so skipiteration 
                if(i == j){
                    if(nums[i]==nums[j]){
                        continue;
                    }
                }
                // if the numbers[i] and [j] add up to target then return 
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
