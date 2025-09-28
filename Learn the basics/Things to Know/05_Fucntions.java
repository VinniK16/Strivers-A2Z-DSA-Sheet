/*
Problem: Write a function int max_of_four(int a, int b, int c, int d) which returns the maximum of the four arguments it receives.
         Input will contain four integers - a,b,c,d, one per line.
         Output: Return the greatest of the four integers.

Link: https://www.hackerrank.com/challenges/c-tutorial-functions/problem?isFullScreen=true

 */

#include <cmath>
#include <cstdio>
#include <iostream>
#include <algorithm>
using namespace std;

int Greatest_of_four (int a, int b, int c, int d) {
    int max1 = max(a, b);
    int max2 = max(c, d);
    
    return max(max1, max2);
}
int main() {
    
    int a, b, c, d;
    cin >> a;
    cin >> b;
    cin >> c;
    cin >> d;
    
    cout << Greatest_of_four(a, b, c, d) << endl;
    
    return 0;
}
