class Solution {
    public String solution(String s) {
        
        String[] words = s.split(" ", -1);
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j % 2 == 0) {
                    stringBuilder.append(Character.toUpperCase(words[i].charAt(j)));
                } else {
                    stringBuilder.append(Character.toLowerCase(words[i].charAt(j)));
                }
            }
            
            if (i < words.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
