import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int remaining = n - i;
            if (citations[i] >= remaining) {
                return remaining;
            }
        }
        
        return 0;
    }
}