class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int right=0;
        int count=0;
        int max=0;
        while(right<nums.length)
        {
            count=0;
            while(right<nums.length&&nums[right]==1 )
            {
                
                count=count+1;
                right++;

            }
            max=Math.max(max,count);
            right++;
            left=right;

        }
        return max;
        
        
    }
}