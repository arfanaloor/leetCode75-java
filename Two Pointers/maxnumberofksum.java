class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0,i=0,j=nums.length-1,sum=0;
        Arrays.sort(nums);
        while(i<j && i<nums.length-1){
            sum=nums[i]+nums[j];
            if(sum==k){
                count++;
                i++;
                j--;
            }
            else if(sum<k)
                i++;
            else
                j--;   
        }
        return count;
    }
}

//SOLUTION
/*
1.Initialise the variables
2.Sort the array
3.Start a loop to scan the array from left and rigth
	3.1 Find the sum of both the values of i and j
	3.2 If sum is equal to k, increment count,i and decrement j
	3.3 If sum is less than k, increment i
	3.4 else , decrement i
4.return count
*/