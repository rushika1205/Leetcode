class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
       int left=0;
       int minlen=Integer.MAX_VALUE;
       int currsum=0;

       for(int right=0;right<=nums.length-1;right++)
       {
        currsum+=nums[right];
        while(currsum >=target)
        {   
            if(right-left+1 < minlen)
            {
                minlen=right-left+1;
            }
            currsum-=nums[left];
            left++;

        }
       }
       return minlen != Integer.MAX_VALUE ? minlen : 0;

    }
}