class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
        int digit = 0;
        while(n!=0)
        {
            digit += Math.pow(n % 10, 2.0);
            n = n / 10;
        }
        
        if (digit == 1)
        {
            return true;
        }
        n = digit;
        if(set.contains(n))
        {
            return false;
        }
        set.add(n);
    }
}
}