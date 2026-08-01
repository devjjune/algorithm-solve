import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        Map<String, List<int[]>> genreMap = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int[] songInfo = {i, plays[i]};
            
            if (genreMap.containsKey(genre)) {
                genreMap.get(genre).add(songInfo);
            } else {
                List<int[]> newList = new ArrayList<>();
                newList.add(songInfo);
                genreMap.put(genre, newList);
            }
        }
        
        Map<String, Integer> totalPlays = new HashMap<>();
        
        for (String genre : genreMap.keySet()) {
            List<int[]> songs = genreMap.get(genre);
            int sum = 0;
            for (int[] song : songs) {
                sum += song[1];
            }
            
            totalPlays.put(genre, sum);
        }
        
        List<String> genreOrder = new ArrayList<>(totalPlays.keySet());
        genreOrder.sort((a, b) -> totalPlays.get(b) - totalPlays.get(a));
        
        List<Integer> resultList = new ArrayList<>();
        
        for (String genre : genreOrder) {
            List<int[]> songs = genreMap.get(genre);
            
            songs.sort((a, b) -> b[1] - a[1]);
            
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                resultList.add(songs.get(i)[0]);
            }
        }
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}