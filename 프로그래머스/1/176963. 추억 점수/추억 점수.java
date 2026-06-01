import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        Map<String, Integer> hashMap = new HashMap<>();
        int[] result = new int[photo.length];
        
        for (int i = 0; i < name.length; i++) {
            hashMap.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            
            int sum = 0;
            
            for (int j = 0; j < photo[i].length; j++) {
                sum += hashMap.getOrDefault(photo[i][j], 0);
            }
            
            result[i] = sum;
        }
        
        return result;
    }
}