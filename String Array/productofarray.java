class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        int curr=1;
        for(int i=0; i<n; i++) {
            res[i] *= curr;
            curr *= nums[i];
        }
        curr =1;
        for(int i=n-1; i>=0; i--) {
            res[i] *= curr;
            curr *= nums[i];
        }
        return res;
    }
}
//SOLUTION
/*
1.Creat a new array with the size of original array
2.Find the suffix of the array and save it in the new array
3.Find the prefix of the array and save the product of the already existing value and prefix
4.return the new Array
*/