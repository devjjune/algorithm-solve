import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        Map<Integer, Double> results = new HashMap<>();
        
        int challenger = stages.length;
        
        for (int i = 1; i < N + 1; i++) {
            
            int count = 0;
            
            for (int s : stages) {
                if (s == i) {
                    count ++;
                    
                }
            }
            
            if (challenger == 0) {
                results.put(i, 0.0);
            } else {
                results.put(i, (double) count / challenger);
            }
            
            challenger -= count;
        }
        
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(results.entrySet());
        
        list.sort(
            Comparator
                .comparing(Map.Entry<Integer, Double>::getValue)
                .reversed()
                .thenComparing(Map.Entry::getKey)
        );
            
        int[] answer = new int[N];
            
        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).getKey();
        }
            
        return answer;
    }
}
            