/*

Problem: Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
         Note that you must do this in-place without making a copy of the array.

Link: https://leetcode.com/problems/move-zeroes/description/

*/

class Solution {
    public void moveZeroes(int[] nums) {

        //move all non-zero elements to the front
        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        //fill the remaining positions with zeroes
        for(int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}