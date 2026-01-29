class Solution {
    public double solution(int num1, int num2) {
        double answer1 =  (double) num1 / num2;
        double answer2 = answer1 * 1000;
        return (int) answer2;
    }
}