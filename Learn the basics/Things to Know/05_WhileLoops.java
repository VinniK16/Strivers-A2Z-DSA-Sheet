/*
Problem: While loop is another loop like for loop but unlike for loop it only checks for one condition.
         Here, we will use a while loop and print a number n's table in reverse order.
         
Link: https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1

Approach:
- Initialize a counter i = 10.
- Use a while loop until i becomes 0.
- In each iteration:
       - Multiply n by i.
       - Print the result on the same line.
       - Print a space after each number except the last one.
       - Decrement i.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    public void calculateMultiples(int n) {
        int i = 10;
        
        while(i != 0) {
            System.out.print(n*i + " ");
            i--;
        }
    }
}

