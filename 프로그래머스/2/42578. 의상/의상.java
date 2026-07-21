import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> clothesCount = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String category = cloth[1];
            
            if (clothesCount.containsKey(category)) {
                int current = clothesCount.get(category);
                clothesCount.put(category, current + 1);
            } else {
                clothesCount.put(category, 1);
            }
        }
        
        int result = 1;
        
        for (String category : clothesCount.keySet()) {
            result *= (clothesCount.get(category) + 1);
        }
        
        return result - 1;
    }
}