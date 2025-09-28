/*

Problem: Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.

Link: https://takeuforward.org/plus/dsa/problems/sum-of-first-n-numbers

*/

class Solution{	
	public:
		int NnumbersSum(int N){
			
            if(N <= 0) return;

            return N + NnumbersSum(N-1);
		}
};