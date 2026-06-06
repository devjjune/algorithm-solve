class Solution {
    public int solution(String t, String p) {
        
        int count = 0;
        long target = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String part = t.substring(i, i + p.length());

            if (Long.parseLong(part) <= target) {
                count++;
            }
        }
        
        return count;
    }
}