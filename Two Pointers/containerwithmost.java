class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int area,i=0;
        int j=height.length-1;
        while(j!=i){
            area=(Math.min(height[i],height[j]))*(j-i);
            max=Math.max(area,max);
            if(height[i] >= height[j])
                j--;
            else
                i++;
        }
        return max;
    }
}

//SOLUTION
/*
    1. Initialise the variables
    2. while i < j
        2.1 find area
        2.2 check is area or maxarea is bigger, if yes change maxarea to area
        2.3 if value of i < j, i++
        2.4 else j--
    3. return maxarea
 */