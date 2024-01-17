class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0; i<t.length(); i++){
            if(j!=s.length() && t.charAt(i) == s.charAt(j))
                j++;
        }
        if(s.length() == j)
            return true;
        return false;
    }
}

//SOLUTION
/*
1.Initialize j-0;
2.Scan through the array
	2.1 If the length of sub array is not equal to j and character at i of t array is equal to character at j of sub array, then increment j
3.if length of sub array is equal to j, return true
4.retrun false
*/