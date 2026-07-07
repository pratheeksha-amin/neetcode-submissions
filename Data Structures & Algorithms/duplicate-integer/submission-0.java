class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len=nums.length;
        boolean found=false;
        int i,j;
        for(i=0;i<len;i++)//3
        {
            for(j=i+1;j<len;j++)//3
            {
                if(nums[i]==nums[j])
                {
                    found=true;
                    break;
                }
            }
        }
        if(found==true)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}