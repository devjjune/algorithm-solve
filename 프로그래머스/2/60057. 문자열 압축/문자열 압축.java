class Solution {
    public int solution(String s) {
        
        int answer = s.length();
        
        for (int unit = 1; unit <= s.length()/2; unit++) {
            
            String prev = s.substring(0, unit);
            int count = 1;
            StringBuilder sb = new StringBuilder();
        
            for (int i = unit; i < s.length(); i += unit) {
                
                int end = Math.min(i + unit, s.length());
            
                String current = s.substring(i, end);
    
                if (current.equals(prev)) {
                    count++;
                } else {
                    sb.append(count > 1? count + prev: prev);
                
                    prev = current;
                    count = 1;
                }
            }
            sb.append(count > 1? count + prev: prev);
            
            if (sb.length() < answer) {
                answer = sb.length();
            }
        }
        
        return answer;
    }
}