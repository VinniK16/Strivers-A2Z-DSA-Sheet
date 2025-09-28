/*
Problem: Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.
         - You must not use any loops such as for, while, or do-while.
         - The function should print each number on a separate line, in increasing order from 1 to n.

Link: https://takeuforward.org/plus/dsa/problems/print-1-to-n-using-recursion

*/

#include <iostream>
using namespace std;

class Solution {
  public:
    void printNumbers(int n) {
        
        if(n <= 0) return;

        printNumbers(n-1);

        cout << n << endl;
    }
};