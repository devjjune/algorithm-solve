class Solution {
    public int[] solution(int n) {
        
        int[] result = new int[(n + 1) / 2];
        
        int idx = 0;
        
        for (int i = 1; i <= n; i += 2) {
            result[idx] = i;
            idx++;
        }
        
        return result;
    }
}