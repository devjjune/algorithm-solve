import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Set<String> phoneNums = new HashSet<>();
        boolean result = true;
        
        for (String phoneNum : phone_book) {
            phoneNums.add(phoneNum);
        }
        
        for (String phoneNum : phone_book) {
            for (int i = 1; i < phoneNum.length(); i++) {
                String prefix = phoneNum.substring(0, i);
                
                if (phoneNums.contains(prefix)) {
                    result = false;
                }
            }
        }
        
        return result;
    }
}