/*

Problem: Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.
         - You must not use any loops such as for, while, or do-while.
         - The function should print each number on a separate line, in decreasing order from n to 1

Link: https://takeuforward.org/plus/dsa/problems/print-n-to-1-using-recursion

*/

#include <iostream>
using namespace std;

class Solution {
  public:
    void printNumbers(int n) {
        if(n <= 0) return;

        cout << n << endl;

        printNumbers(n-1);
    }
};