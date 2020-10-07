class Solution {
    public int fib(int N) {        
        return  fibonocci(N);  
    }    
    
    private int fibonocci(int n)
    {        
        if (n==0)
          return 0;
        if (n==1)
         return 1;
        
        int f= fibonocci(n-1)+fibonocci(n-2);
        
        return f;
    }
}