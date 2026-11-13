class Solution {
    public int countDigits(int num) {
        int countcopy = num;
        int count = 0;
        while(countcopy!=0)
        {
            int digit = countcopy % 10;
            countcopy /= 10;
            if(num % digit ==0)
            {
                count++;
            }
        }
        return count;
    }
}