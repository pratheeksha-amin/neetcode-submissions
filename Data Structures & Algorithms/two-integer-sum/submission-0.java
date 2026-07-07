class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(nums[i]+nums[j]==target && i!=j)
                {
                    return new int[] {i,j};
                }
                
            }
        }
        return new int[] {};
    }
}
