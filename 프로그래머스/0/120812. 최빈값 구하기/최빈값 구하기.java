class Solution {
    public int solution(int[] array) {
        int[] result = new int[1000];
        
        for (int num : array) {
            result[num] ++;
        }
        
        int max = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
            }
        }
        
        int answer = -1;
        int count = 0;
        
        for (int i = 0; i < result.length; i++) {
            if (result[i] == max) {
                answer = i;
                count++;
            }
        }
        if (count > 1) return -1;
        return answer;
    }
}