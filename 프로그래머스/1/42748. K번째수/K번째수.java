import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        return Arrays.stream(commands)
            .mapToInt(command -> {
                int[] temp = Arrays.copyOfRange(array, command[0] - 1, command[1]);
                Arrays.sort(temp);
                return temp[command[2] - 1];
            }).toArray();
    }
}