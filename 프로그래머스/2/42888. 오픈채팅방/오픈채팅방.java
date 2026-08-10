import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        Map<String, String> users = new HashMap<>();
        List<String> logs = new ArrayList<>();
        
        
        for (String log : record) {
            
            String[] tokens = log.split(" ");
            
            if (!tokens[0].equals("Leave")) {
                users.put(tokens[1], tokens[2]);
            }
    
            if (!tokens[0].equals("Change")) {
                logs.add(tokens[0] + " " + tokens[1]);
            }
        }
        
        String[] result = new String[logs.size()];
        
        for (int i = 0; i < logs.size(); i++) {
            
            String[] tokens = logs.get(i).split(" ");
            
            if (logs.get(i).startsWith("Enter")) {
                result[i] = users.get(tokens[1]) + "님이 들어왔습니다.";
            } else {
                result[i] = users.get(tokens[1]) + "님이 나갔습니다.";
            }
        }
        
        return result;
    }
}