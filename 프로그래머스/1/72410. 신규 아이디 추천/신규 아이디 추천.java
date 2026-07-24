class Solution {
    public String solution(String new_id) {
        
        String id = new_id.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : id.toCharArray()) {
            if (Character.isLowerCase(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
                if (c == '.' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
                    continue;
                }
                
                sb.append(c);
            }
        }
        
        if (sb.length() > 0 && sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }
        
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if (sb.length() == 0) {
            sb.append("a");
        }
        
        if (sb.length() > 15) {
            sb.delete(15, sb.length());
            
            if (sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        
        while (sb.length() <= 2) {
            sb.append(sb.charAt(sb.length() - 1));
        }
        
        return sb.toString();
    }
}