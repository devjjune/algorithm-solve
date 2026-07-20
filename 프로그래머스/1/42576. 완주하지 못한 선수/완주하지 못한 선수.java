import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> nameCount = new HashMap<>();
        String answer = "";
        
        for (String name : participant) {
            if (nameCount.containsKey(name)) {
                int current = nameCount.get(name);
                nameCount.put(name, current + 1);
            } else {
                nameCount.put(name, 1);
            }
        }
        
        for (String name : completion) {
            int current = nameCount.get(name);
            nameCount.put(name, current - 1);
        }
        
        for (String name : nameCount.keySet()) {
            if (nameCount.get(name) > 0) {
                answer = name;
            }
        }
        
        return answer;
    }
}