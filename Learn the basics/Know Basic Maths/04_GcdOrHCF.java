/*

Problem: You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. 
         Return the GCD of the two numbers.
         
         The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

Link: https://takeuforward.org/plus/dsa/problems/gcd-of-two-numbers

*/

class Solution {
    public int GCD(int n1, int n2) {

        if(n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        while(n2 != 0) {
            int g = n1 % n2;
            n1 = n2;
            n2 = g;
        }

        return n1;
    }
}