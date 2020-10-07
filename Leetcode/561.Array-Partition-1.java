class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
       
        if(nums.length==2)
            return nums[0];
       
         //1 2 5 6 7 9
        // 0 0 1 3 6 7
        // 1 2 5 6 7 9
        // 0 1 2 3 4 5
        int max=0;
        for(int i=0;i<=nums.length-2;i=i+2)
        {            
            max+=nums[i];                        
        }        
        return max;
    }
}