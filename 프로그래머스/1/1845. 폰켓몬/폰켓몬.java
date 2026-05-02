import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int num = nums.length/2;
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            set.add(i);
        }
        
        return (set.size() >= num) ? num : set.size();
    }
}