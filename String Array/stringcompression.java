class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        s.append(chars[0]);
        int i=1;
        while(i<chars.length) {
            int ele = 1;
            if(chars[i] != chars[i-1]) {
                s.append(chars[i]);
                i++;
            }
            else {
                while(i<chars.length && chars[i] == chars[i-1] ) {
                    ele++;
                    i++;
                }
                if(ele < 10)
                    s.append(ele);
                else {
                    StringBuilder big = new StringBuilder();
                    big.append(ele);
                    for(int j=0; j<big.length(); j++) {
                        s.append(big.charAt(j));
                    }
                }
            }
        }
        for(i=0; i<s.length(); i++) {
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
}

//SOLUTION
/*
1.Create a StringBuilder to store the character
2.Scan the array chars
3.if the first character is not equal to second character , append the character to the string
4.If it is equal, increment the count until it is not equal and append the character and count into the stringBuilder
5.Copy the StringBuilder to the array and return the length og the StringBuilder
*/