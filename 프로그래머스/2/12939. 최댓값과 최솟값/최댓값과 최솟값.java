class Solution {
    public String solution(String s) {
        
        String[] arr = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String str : arr) {
            int n = Integer.parseInt(str);
            min = Math.min(min, n);
            max = Math.max(max, n);
            
        }
        
        return min + " " + max;
    }
}