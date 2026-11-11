class Solution {
    public int countPrimes(int n) {
        boolean countprimes[] = new boolean[n];
        int limit = (int)Math.sqrt(n);
        if(n < 2){
            return 0;
        }
        for(int i = 2; i<= limit; i++)
        {
            if(countprimes[i]== false){
                for(int j = i*i; j< n; j+= i)
                {
                    countprimes[j] = true;
                }
            }
        }
        int count = 0;
        for(int i = 2; i<n; i++)
        {
            if(countprimes[i]== false)
            {
                count++;
            }
        }
        return count;
    }
}