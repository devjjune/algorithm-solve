import java.util.*;

class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
            
        for (char c = 'a'; c <= 'z'; c++) {
            
            final char ch = c;
            
            if (s.chars().filter(x -> x == ch).count() == 1) {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}