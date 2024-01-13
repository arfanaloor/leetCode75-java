class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder nw = new StringBuilder();
        for(int i= s.length()-1; i>=0; i--) {
            int sub = i;
            while(i>=0 && s.charAt(i) != ' ') {
                i--;
            }
            String word = s.substring(i+1,sub+1);
            if(word.equals(""))
            continue;
            nw.append(word);
            nw.append(" ");
        }
        return nw.toString().trim();
    }
}

//SOLUTION
/*
1. Create a new String Builder 
2. Scan the String s from right to left and make sub = i
3. While i>=0 and character at i is not equal to " ", decrement i
4. Create a String called word and append the substring of s from i+1 to sub+1
5. if string word equals "", continue
6. append the word into the String Builder
7. return the String Builder
*/