/*

Problem: Given an integer x, return true if x is a palindrome, and false otherwise.

Link: https://leetcode.com/problems/palindrome-number/description/

*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int original=x, rev=0;

        while(x > 0) {
            int rem = x % 10;
            rev = rev*10 + rem;
            x /= 10;
        }

        return original == rev;
    }
}