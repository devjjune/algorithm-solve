class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        
        String[] letters = letter.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String m : letters) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(m)) {
                    result.append((char)('a' + i));
                }
            }
        }
        return result.toString();
    }
}