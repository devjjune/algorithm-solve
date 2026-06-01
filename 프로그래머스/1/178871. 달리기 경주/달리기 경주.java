import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            hashMap.put(players[i], i);
        }
        
        for (String calling : callings) {
            
            int currentRank = hashMap.get(calling);
            int prevRank = currentRank - 1;
            String prevPlayer = players[prevRank];
            
            // players 순서 갱신
            players[prevRank] = calling;
            players[currentRank] = prevPlayer;
            
            // hashMap 등수 값 갱신
            hashMap.put(calling, prevRank);
            hashMap.put(prevPlayer, currentRank);
            
        }
        
        return players;
    }
}