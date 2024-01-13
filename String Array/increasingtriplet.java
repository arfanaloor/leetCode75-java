class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3 || nums == null){
            return false;
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= a)
                a=nums[i];
            else if(nums[i] <= b)
                b=nums[i];
            else
                return true; 
        }
        return false;
    }
}

//SOLUTION
/*
1.Check whether the length or array is null or belom 3, if yes return false
2.Declare two integers a,b with max value of an integer
2.Scan the whole array check
	3.1 if value of index is less than or equal to a, if yes add the valur of index to a
	3.2 Else if valur of index is greater than or equal to b, if yes add the value of index to b
	3.3 Else, return true
4.return false
*/