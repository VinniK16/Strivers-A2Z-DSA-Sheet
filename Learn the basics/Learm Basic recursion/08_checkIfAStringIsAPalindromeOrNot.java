/*

Problem: A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. 
         Alphanumeric characters include letters and numbers.

         Given a string s, return true if it is a palindrome, or false otherwise.

Link: https://leetcode.com/problems/valid-palindrome/description/

*/


class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                newS.append(Character.toLowerCase(ch));
            }
        }
    
        String clearS = newS.toString(); 
        String revS = newS.reverse().toString(); 
        return clearS.equals(revS);
    }
}