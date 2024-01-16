class Solution {
    public void moveZeroes(int[] nums) {
        int counter = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0)
                nums[counter++] = nums[i];
        }
        while(counter<nums.length){
            nums[counter++]=0;
        }
    }
    
}
//SOLUTION
/*
1. Initialize counter into 0;
2. Scan the array from left to right
2.1 if the value fo nums in ith index is not equal to 0
2.1.1 nums[counter] = nums[i], increment counter
3. Fill the index from counter to lenght with 0s
*/