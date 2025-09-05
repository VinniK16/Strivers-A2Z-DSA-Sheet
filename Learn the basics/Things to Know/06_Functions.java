/*
Problem: Geek is learning about functions and calling a function with arguments. 
         He learns that passing can take one of two forms: pass by value or pass 
         by reference.

         Geek wishes to add 1 and 2, respectively, to the parameter passed by 
         value and reference. Help Geek in fulfilling his goal.

Link: https://www.geeksforgeeks.org/problems/pass-by-reference-and-value/1

Approach:
- Increment 'a' by 1 → simulates pass by value.
- Increment 'b' by 2 → simulates pass by reference.
- Store both results in an array and return.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    static int[] passedBy(int a, int b) {
        
        int[] result = new int[2];
        result[0] = a + 1; // pass by value
        result[1] = b + 2; // pass by reference
        
        return result;
    }
}

