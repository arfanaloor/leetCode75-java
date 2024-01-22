class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int pref=0,suff=0;
        for(int i=1; i<pre.length; i++){
            pref+=nums[i-1];
            pre[i]=pref;
        }
        for(int i=suf.length-2; i>=0; i--){
            suff+=nums[i+1];
            suf[i]=suff;
        }
        for(int i=0; i<nums.length; i++){
            if(suf[i]==pre[i])
                return i;
        }
        return -1;
    }
}

//SOLUTION
/*
1. Create 2 new arrays to store the prefix and suffix of the nums array
2. Find and store the prefix of nums
3. Find and store the suffix of nums
4. Compare the index of prefex and suffix ,if any of the value of index is same return the index,
5. If not return -1
*/