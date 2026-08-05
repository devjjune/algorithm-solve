import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] time = new int[progresses.length];
        
        for (int i = 0; i < progresses.length; i++) {
            time[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
        }
        
        List<Integer> result = new ArrayList<>();
        int prev = time[0];
        int count = 0;
        
        for (int i = 0; i < time.length; i++) {
            if (time[i] <= prev) {
                count ++;
            } else {
                result.add(count);
                prev = time[i];
                count = 1;
            }
        }
        result.add(count);
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}