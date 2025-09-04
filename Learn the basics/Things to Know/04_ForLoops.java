/*
Problem: The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

         F(n) = F(n - 1) + F(n - 2), 
         Where, F(1) = 1, F(2) = 1


         Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by 
         using conditionals like if else and return what's expected.

         "Indexing is start from 1"
         
Link: https://www.naukri.com/code360/problems/nth-fibonacci-number_74156

Approach:
- If n = 1 or n = 2, directly return 1.
- For n > 2, use an iterative approach:
  - Maintain two variables prev1 and prev2 to store the last two Fibonacci numbers.
  - Loop from 3 to n:
      - Compute the current Fibonacci number as curr = prev1 + prev2.
      - Update prev1 and prev2 for the next iteration.
- Return curr as the nth Fibonacci number.

Time Complexity: O(n)
Space Complexity: O(1)

*/

public class solution {
         public static int nthFibonacci(int n) {
                  if(n == 1 || n == 2) return 1;
                  int prev1 = 1;
                  int prev2 = 1;
                  int curr = 1;

                  for(int i = 3; i <= n; i++) {
                           curr = prev1 + prev2;
                           prev1 = prev2;
                           prev2 = curr;
                  }

                  return curr;
         }

         public static void main(String args[]) {
                  Scanner sc = new Scanner(System.im);
                  int n = sc.nextInt();

                  System.out.println(nthFibonacci(n));
         }
}
