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
        // 정렬했으면 굳이 끝까지 카운트할 필요 X
        /*
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                return array.length - i;
            }
        }
        return 0; // 더 큰 사람이 없을 때
         */
        
        return result;
    }
}

/*
=== 향상된 for문을 활용하는 습관을 들이자 ===
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int h : array) { // 배열을 하나씩 꺼내서
            if (h > height) answer++; // 나보다 크면 카운트
        }
        return answer;
    }
}
 */

/*
=== Stream 활용 ===
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        // 배열을 흐름(Stream)으로 만들고 -> 키가 큰 사람만 필터링해서 -> 개수를 센다
        return (int) Arrays.stream(array).filter(h -> h > height).count();
    }
}
 */