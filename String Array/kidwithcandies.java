class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int great = greatestelement(candies);
        ArrayList<Boolean> arr = new ArrayList<Boolean>(candies.length);
        for(int i=0; i<candies.length;i++) {
            if((candies[i]+extraCandies) < great) 
                arr.add(false);
            else
                arr.add(true);
        }
        return arr;
    }
    public static int greatestelement(int[] candies) {
        int great=0;
        for(int i=0; i<candies.length; i++) {
            if(candies[i] > great) {
                great = candies[i];
            }
        }
        return great;
    }
}

//SOLUTION
/*
    1.Find the largest element of the array 
    2.Create a ArrayList arr with length of the largest element in the array
    3.Initiate a for loop with i to array.length
        3.1 If array[i]+extraCandies < greatest element
            3.1.1 add false to the ArrayList
        3.2 Else
            3.2.1 add true to the Array List
    4.Return ArrayList
*/