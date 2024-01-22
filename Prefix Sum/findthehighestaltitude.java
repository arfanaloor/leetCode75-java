class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,count=0;
        for(int i=0; i<gain.length; i++){
            count+=gain[i];
            max=Math.max(max,count);
        }
        return max;
    }
}

//SOLUTION
/*
1. Initialise `max`,`count` as 0
2. Start a loop from `gain`[0] to `gain`[gain.length-n], add `gain`[i] to `count`
2.1 Store the greatest element between `max` and `count` into `max`
3. Return `max`
*/