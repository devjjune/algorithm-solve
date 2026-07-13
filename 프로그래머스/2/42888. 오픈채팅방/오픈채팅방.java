import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        Map<String, String> lastNickName = new HashMap<>();
        List<String> result = new ArrayList<>();
        
        for (String entry : record) {
            String[] tokens = entry.split(" ");
            
            if (!tokens[0].equals("Leave")) {
                lastNickName.put(tokens[1], tokens[2]);
            }
        }
        
        for (String entry : record) {
            String[] tokens = entry.split(" ");
            String uid = tokens[1];
            
            if (tokens[0].equals("Enter")) {
                result.add(lastNickName.get(uid) + "님이 들어왔습니다.");
            }
            
            if (tokens[0].equals("Leave")) {
                result.add(lastNickName.get(uid) + "님이 나갔습니다.");
            }
        }
        
        return result.toArray(new String[0]);
    }
}