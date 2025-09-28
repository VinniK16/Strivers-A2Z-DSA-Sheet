/*

Problem: You are given an integer n. You need to check if the number is prime or not. 
         Return true if it is a prime number, otherwise return false.

Link: https://takeuforward.org/plus/dsa/problems/check-for-prime-number

*/

class Solution {
    public boolean isPrime(int n) {
        
        if(n == 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3; i*i <= n; i+=2) {
            if(n % i == 0) return false;
        }

        return true; 
    }
}