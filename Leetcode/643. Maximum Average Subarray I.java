class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        int firstsubarraysum=0;
        
        for(int i=0;i<k;i++)
        {
            firstsubarraysum+= nums[i];                
            
        }
        int maxsum=firstsubarraysum;
        for(int i=1;i<=nums.length-k;i++)
        {          
           // System.out.println(firstsubarraysum);
            firstsubarraysum = firstsubarraysum-nums[i-1]+nums[i+(k-1)];
            maxsum = Math.max(maxsum, firstsubarraysum);
            
        }
        
       return (double)maxsum/k;  
        
    }
}