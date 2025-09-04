/*
Problem: Given an integer choice denoting the choice of the user and a list 
         containing the single value R or two values L and B depending on the 
         choice.
         If the user's choice is 1, calculate the area of the circle having the 
         given radius(R). Else if the choice is 2, calculate the area of the 
         rectangle with the given length(L) and breadth(B).

         Note : A list arr[], containing the single value R or the two values L 
                and B, as input parameters. Return the area of the desired 
                geometrical figure. Use Math.PI for the value of pi.

Link: https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1

Approach:
- Use a switch statement on the variable `choice`.
- If `choice == 1`, calculate circle area using formula: π × R².
- If `choice == 2`, calculate rectangle area using formula: L × B.
- Return the calculated result.

Time Complexity: O(1)
Space Complexity: O(1)
*/
import java.util.List;

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        
        double res = 0;
        
        switch (choice) {
            case 1 : {
                res = Math.PI * arr.get(0) * arr.get(0);
                break;
            } 
            
            case 2 : {
                res = arr.get(0) * arr.get(1);
            }
        }
        
        return res;
        
    }
}