/*
Problem: Given marks of a student, print on the screen:

             - Grade A if marks >= 90
             - Grade B if marks >= 70
             - Grade C if marks >= 50
             - Grade D if marks >= 35
             - Fail, otherwise.

Link: https://takeuforward.org/plus/dsa/problems/if-elseif
*/

class Solution {
    public void studentGrade(int marks) {
        if(marks >= 90) {
            System.out.println("A");
        } else if(marks >= 70) {
            System.out.println("B");
        } else if(marks >= 50) {
            System.out.println("C");
        } else if(marks >= 35) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }
}