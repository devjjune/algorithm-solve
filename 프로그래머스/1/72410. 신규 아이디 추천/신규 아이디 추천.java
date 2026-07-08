class Solution {
    public String solution(String new_id) {
        
        String result = new_id.toLowerCase();
        result = result.replaceAll("[^a-z0-9\\-_.]", "");
        result = result.replaceAll("\\.{2,}", ".");
        result = result.replaceAll("^\\.|\\.$", "");
        
        if (result.isEmpty()) {
            result = "a";
        }
        
        if (result.length() > 15) {
            result = result.substring(0, 15);
            result = result.replaceAll("\\.$", "");
        }
        
        while (result.length() < 3) {
            result += result.charAt(result.length() - 1);
        }
        
        return result;
    }
}