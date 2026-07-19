class Solution {
    public String solution(String p) {
        
        if (p.isEmpty()) return p;
        
        String[] parts = splitBalanced(p);
        String u = parts[0];
        String v = parts[1];
        
        if (isCorrect(u)) {
            return u + solution(v);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(solution(v));
            sb.append(")");
            
            String middle = u.substring(1, u.length() - 1);
            for (char c : middle.toCharArray()) {
                sb.append(c == '(' ? ')' : '(');
            }
            return sb.toString();
        }
        
    }

    
    
    String[] splitBalanced(String p) {
        int balance = 0;
        
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                balance ++;
            } else if (p.charAt(i) == ')') {
                balance --;
            }
            
            if (balance == 0) {
                String u = p.substring(0, i + 1);
                String v = p.substring(i + 1);
                return new String[]{u, v};
            }
        }
        return null;
    }
        
    boolean isCorrect(String u) {
        
        int balance = 0;
        
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                balance ++;
            } else if (u.charAt(i) == ')') {
                balance --;
            }
            
            if (balance < 0) {
                return false;
            }
        }
        return true;
    }
}