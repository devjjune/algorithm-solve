class Solution {
    public int solution(int n) {
        
        int result = 0;
            
        while (true) {
            result ++;
            
            if (result * 6 % n == 0) {
                return result;
            }
        }
    }
}