// Leetcode - 1822. Sign of the Product of an Array.
class Solution {
    public int arraySign(int[] nums) {
     int product=1;
     for(int i=0; i<nums.length; i++){
         if(nums[i] < 0){
         product *= -1;
         }
         if (nums[i] == 0) {
             product *= 0;
         }
     }   
     return product;
    }
}

/* There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).
*/
