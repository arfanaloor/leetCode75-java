class Solution {
    public int maxVowels(String s, int k) {
        int count=0,maxcount;
        for(int i=0; i<k;i++) {
            int c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' ||c=='o' ||c=='u') 
                count++;
        }
        maxcount=count;
        for(int i=0;i<s.length()-k;i++) {
            int c1 = s.charAt(i);
            int c2 = s.charAt(i+k);
            if(c1=='a' || c1=='e' || c1=='i' ||c1=='o' ||c1=='u')
                count--;
            if(c2=='a' || c2=='e' || c2=='i' ||c2=='o' ||c2=='u') 
                count++;
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}

//SOLUTION
/*
1. Initialse the variable count and maxsum
2. Find the count of vowels in first k elements and save it to maxsum
3. Start a loop form 0 to string lenght -k
3.1 Save the Character at i and i+k to c1 and c2
3.2 If c1 is a vowel , decrement count
3.2 If c2 is a vowel , increment count
3.3 Store the greatest number between count and maxsum to maxsum
4. return maxsum
*/
