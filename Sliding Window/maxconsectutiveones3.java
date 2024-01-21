class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0;
        while(i<nums.length) {
            if(nums[i]==0)
                k--;
            if(k<0) {
                if(nums[j] == 0)
                    k++;
                j++;
            }
        i++;
        }
        return i-j;
    }
}

//SOLUTION
/*
1. Initialise i and j as 0
2. while i is less than length of the array
2.1 if correct i value is zero, decrement k
2.2 if k is less than 0
2.2.1 if value of j is 0, increment k
2.3 increment j
3. increment i
4. return i-j
*/