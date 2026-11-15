class Solution {
    public static int findpivotindex(int[] nums)
    {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        if(nums[s]< nums[e])
        {
            return -1;
        }
        while( s<= e)
        {
            int mid = s + (e-s)/2;
            if(nums[mid]<= nums[n-1])
            {
                e = mid-1;
            }
            else{
                ans = mid;
                s = mid + 1;
            }
           
        }
         return ans;
    }
    public static int binarysearch(int[] nums,int s , int e, int target)
    {
        int n = nums.length;
        while(s <= e)
        {
            int mid = s + (e-s)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1 ;
    }
 
    public int search(int[] nums, int target) {
        int pivot = findpivotindex(nums);
        int n = nums.length;
        int ans = -1;
        if(pivot == -1)
        {
            ans = binarysearch(nums,0, n - 1, target);
            return ans;
        }
        else{
            int startarray1 = 0;
            int endarray1 = pivot;
            if(target>= nums[startarray1] && target <= nums[endarray1])
            {
                ans = binarysearch(nums,startarray1, endarray1,target);
                return ans;
            }
            int startarray2 = pivot + 1;
            int endarray2 = n - 1;
            if(target >= nums[startarray2] && target <= nums[endarray2])
            {
                ans = binarysearch(nums,startarray2, endarray2, target);
                return ans;
            }
        }
            return -1;
    }
}