class Solution {
    public String reverseVowels(String s) {
        StringBuilder vov = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if( c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vov.append(s.charAt(i));
            }
        }
        vov.reverse();
        int j=0;
        StringBuilder nw = new StringBuilder(s);
        for(int i=0; i<s.length(); i++) {
            char c = nw.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                nw.setCharAt(i, vov.charAt(j));
                j++;
            }

        }
        return nw.toString();
    }
}
//SOLUTION
/*
    1. Scan the String to check for vowels and if found append it to a StringBuilder
    2. Reverse the StringBuilder using reverse() funtion
    3. Re insert the StringBuilder into the String where vowels are found

*/