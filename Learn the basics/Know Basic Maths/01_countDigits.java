/*
Problem: You are given an integer n. You need to return the number of digits in the number.
         The number will have no leading zeroes, except when the number is 0 itself.
         0 <= n <= 5000

Link: https://takeuforward.org/plus/dsa/problems/count-all-digits-of-a-number

*/

class Solution {
    public int countDigit(int n) {

        if(n == 0) return 1;
        
        int count = 0;

        while(n > 0) {
            count++;
            n = n/10;
        }

        return count;
    }
}