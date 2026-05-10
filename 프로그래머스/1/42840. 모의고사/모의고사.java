import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] counts = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if(student1[i % student1.length] == answers[i]) {
                counts[0]++;
            }
            if(student2[i % student2.length] == answers[i]) {
                counts[1]++;
            }
            if(student3[i % student3.length] == answers[i]) {
                counts[2]++;
            }
        }
        
        int maxScore = Math.max(counts[0], Math.max(counts[1], counts[2]));
        
        List<Integer> list = new ArrayList<>();
        if (maxScore == counts[0]) list.add(1);
        if (maxScore == counts[1]) list.add(2);
        if (maxScore == counts[2]) list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}