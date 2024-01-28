class Solution {
    public String removeStars(String s) {
        StringBuilder c = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '*') {
                c.deleteCharAt(c.length()-1);
            }
            else{
                c.append(s.charAt(i));
            }
        }
        return c.toString();
    }
}

//SOLUTION
/*
1. Create a new String Builder `c`
2. Start a loop from i=0 to i<length of string
2.1 If character at i of string is *, pop the element from the String Builder
2.2 Else, push the element to String Builder
3. Return the String Builder after converting it to String
*/