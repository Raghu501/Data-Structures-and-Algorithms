class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] ret = new int[2];
        
        int lpointer=0;
        int rpointer= numbers.length-1;
        
        while(lpointer<rpointer)
        {
            
            if(numbers[lpointer]+numbers[rpointer] == target)
            {                
                ret[0] = lpointer+1;
                ret[1] = rpointer+1;
                break;
            }
            
            if(numbers[lpointer]+numbers[rpointer] > target)
                rpointer--;
            else
                lpointer++;
        }
        return ret;
    
    }
}