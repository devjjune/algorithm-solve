class Solution {
    public int solution(int n, int k) {
        int total = (n * 12000) + (k * 2000) - (n / 10) * 2000;
        return total;
    }
}