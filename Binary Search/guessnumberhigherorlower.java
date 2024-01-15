/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(guess(n) == 0)
            return n;
        if(guess(1) == 0)
            return 1;
        int right = n-1;
        int left = 2;
        n /= 2;
        while(guess(n) != 0) {
            int g = guess(n);
            if(g>0) {
                left = n;
                n = right - (right-n)/2;
            }
            else {
                right = n;
                n = left + (n-left)/2;
            }
        }
        return n;
    }
}

//SOLUTION
/*
1.Return 0, if n == 0;
2.Return 0, if 1 == 0; checking the first the last element
3.While g != 0
 3.1 if guess(n) > 0
 3.1.1 left = n;
 	n = right - (right-n)/2
 3.1.2 right = n
	n = left + (n-left)/2
4.return n;
*/