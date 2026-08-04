import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (numbers.size() == 0 || arr[i] != arr[i - 1]) {
                numbers.add(arr[i]);
            }
        }
        
        int[] answer = new int[numbers.size()];
        
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        
        return answer;
    }
}