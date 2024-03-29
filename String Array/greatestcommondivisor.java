class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)) {
            int gcd = findGCD(str1.length(),str2.length());
            return str1.substring(0,gcd); 
        }
        return "";
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
//SOLUTION
/*
    1. The if condition checks whether the concatination of two strings in same or not
        1.1. If it is same then we will find the GCD(Greatest Common Divisor) of the lengths of two Strings
        2.1. Then we will return the substring from index 0-gcd
    2. return ""
 */