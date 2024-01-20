class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,maxsum;
        for(int i=0;i<k;i++) {
            sum+=nums[i];
        }
        maxsum=sum;
        for(int i=0;i<nums.length-k;i++) {
            sum=sum-nums[i]+nums[i+k];
            maxsum = Math.max(maxsum,sum);
        }
    return maxsum/k;
    }
}

//SOLUTION
/*
1. Initialise the variables
2. Find the sum of first k elements and stor it in variable sum and maxsum
3. Start a for loop from i=0 to i<length-k
3.1 Subtitute value i and add value i+k to the sum
3.1 Store the larger value (either sum or maxsum) to maxsum
4. return maxsum/k
*/