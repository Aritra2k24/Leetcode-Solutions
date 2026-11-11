class Solution {
    public int trailingZeroes(int n) {
        int trailing_zeroes = 0;
        while(n>=5)
        {
            n = n / 5;
            trailing_zeroes += n;
        }
        return trailing_zeroes;
        
    }
}