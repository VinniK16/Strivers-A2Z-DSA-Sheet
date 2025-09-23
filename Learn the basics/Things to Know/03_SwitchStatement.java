/*
Problem: Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.
         Ensure only the 1st letter of the answer is capitalised.

Link: https://takeuforward.org/plus/dsa/problems/switch-case

 */

 class Solution {
    public void whichWeekDay(int day) {
        switch(day) {
            case 1: {
                System.out.println("Monday");
                break;
            } case 2: {
                System.out.println("Tuesday");
                break;
            } case 3: {
                System.out.println("Wednesday");
                break;
            } case 4: {
                System.out.println("Thusrday");
                break;
            } case 5: {
                System.out.println("Friday");
                break;
            } case 6: {
                System.out.println("Saturday");
                break;
            } case 7: {
                System.out.println("Sunday");
                break;
            } default: {
                System.out.println("Invalid");
            }
        }
    }
}