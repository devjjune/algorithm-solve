import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        
        Set<Character> letters = new LinkedHashSet<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            letters.add(my_string.charAt(i));
        }
        
        return letters.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}