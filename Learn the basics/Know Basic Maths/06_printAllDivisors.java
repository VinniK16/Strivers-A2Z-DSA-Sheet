/*

Problem: You are given an integer n. You need to find all the divisors of n. 
         Return all the divisors of n as an array or list in a sorted order.

Link: https://takeuforward.org/plus/dsa/problems/divisors-of-a-number

*/

class Solution {
    public int[] divisors(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] res = new int[count];
        int j = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res[j] = i;
                j++;
            }
        }

        return res;
    }
}