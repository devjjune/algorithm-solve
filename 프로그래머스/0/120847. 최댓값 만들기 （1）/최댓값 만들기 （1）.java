import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        int last1 = numbers[numbers.length - 1];
        int last2 = numbers[numbers.length - 2];
        
        return last1 * last2;
    }
}
// 배열의 Arrays.sort()
// '정렬'의 다양한 활용