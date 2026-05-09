class Solution {
    public String solution(String new_id) {
        
        String result = new_id.toLowerCase()
            .replaceAll("[^a-z0-9-_.]", "")
            .replaceAll("\\.{2,}", ".")
            .replaceAll("^\\.|\\.$", "");
        
        if(result.isEmpty()) {
            result = "a";
        }
        
        if(result.length() >= 16) {
            result = result.substring(0, 15)
                .replaceAll("\\.$", "");
        }
        
        if(result.length() <= 2) {
            while(result.length() < 3) {
                result += result.charAt(result.length() - 1);
            }
        }
        
        return result;
    }
}