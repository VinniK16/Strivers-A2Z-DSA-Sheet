/*

Problem: Write a function that reverses a string. The input string is given as an array of characters s.
         You must do this by modifying the input array in-place with O(1) extra memory.

Link: https://leetcode.com/problems/reverse-string/description/

*/

class Solution {
    public void reverseString(char[] s) {
        
        int i = 0;
        int j = s.length - 1;

        while(i <= j) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;

            i++;
            j--;
        }
    }
}