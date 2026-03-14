import java.util.*;

class Solution {
    public int solution(String s) {
        
        Stack<Integer> stack = new Stack<>();
        
        String[] arr = s.split(" ");
        
        for (String str : arr) {
            if (str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        
        int sum = 0;
        
        for (int num : stack) {
            sum += num;
        }
        
        return sum;
    }
}