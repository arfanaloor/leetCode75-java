class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,c=1;
        while(i<nums.length) {
            if(nums[i]==0)
                c--;
            if(c<0){
                if(nums[j] == 0)
                c++;
            j++;
            }
            i++;
        }
        return i-j-1;
    }
}

//SOLUTION
/*
1. Initialise variable i,j as 0 as they are starting from the index 0 and c as 1 because only one 0 is allowed in the subarray
2. Start a loop with condition i has to be less then the length of nums
2.1 If value of i in nums is equal to 0, decrement c
2.2 If c is less then 0
2.2.1 If value of j in nums is equal to 0, increment c
2.2.2. increment j
2.3 increment i
3. return i-j-1 because after the loop i will be out of index
*/