class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i=i+2){
            if(flowerbed[i] == 0)
               if(i==flowerbed.length-1 || flowerbed[i]==flowerbed[i+1]){
                   n--;
               }
               else{
                   i++;
               }
        }
        return n<=0;
    }
}
//SOLUTION
/*
	1.Initialise a for loop to iterate through the array by incrementing i by 2
	2.Check if ith position of flowerbed i equal to 0, which is a empty space
		2.1 If i equals length or flowerbed -1 or value of ith position of flowerbed equals i+1th position value of flower bed
			2.1.1 decrement n
		2.2 Else increment i
	3.return n<>=0
*/