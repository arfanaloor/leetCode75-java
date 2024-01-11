class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i=0;
        while(i < word1.length() || i < word2.length()) {
            if(i<word1.length()) {
                result.append(word1.charAt(i));
            }
            if(i<word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}

//SOLUTION
/*
    1.Creat a new String Builder result
    2.while any of the lengths of two String is less then i
        2.1. if length of first String is less then i
            2.1.1 append the character at i into result
        2.2. if length of second String is less then i
            2.2.1 append the character at i into result 
        2.3 increment i
    3.return result
 */