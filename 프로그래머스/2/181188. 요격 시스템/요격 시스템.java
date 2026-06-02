import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        
        Arrays.sort(targets, (a, b) -> a[1] - b[1]);

        int answer = 0;
        int endPoint = -1;

        for (int[] target : targets) {
            
            int start = target[0];
            int end = target[1];

            if (start >= endPoint) {
                answer++;
                endPoint = end;
            }
        }

        return answer;
    }
}