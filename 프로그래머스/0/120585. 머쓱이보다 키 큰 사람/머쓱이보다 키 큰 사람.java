import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        
        int result = 0;
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                result ++;
            }
        }
        
        return result;
    }
}