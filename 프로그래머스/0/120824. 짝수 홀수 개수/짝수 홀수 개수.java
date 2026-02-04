import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[2];
        
        arr[0] = (int) Arrays.stream(num_list)
            .filter(i -> i % 2 == 0)
            .count();
            
        arr[1] = (int) Arrays.stream(num_list)
            .filter(i -> i % 2 == 1)
            .count();
            
        return arr;
    }
}

// count() 메서드는 반환 타입이 long(큰 타입)이므로 int(작은 타입)로 명시적 캐스팅 해줘야 한다.

/* --- 스트림 방법 개선 : 중복 순회 제거 ---
class Solution {
    public int[] solution(int[] num_list) {
        int even = (int) Arrays.stream(num_list).filter(n -> n % 2 == 0).count();

        // 홀수는 전체 길이에서 짝수 개수를 빼서 구함 (중복 순회 방지)
        return new int[]{even, num_list.length - even};
    }
}
 */

/* --- 배열 한 번만 훑기 가능 (결과가 0 또는 1인 경우는 특수한 경우!!!) ---
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; // [0, 0]으로 초기화

        for (int n : num_list) {
            // (나머지를 인덱스로 활용) n % 2가 0이면 answer[0] 증가, 1이면 answer[1] 증가
            answer[n % 2]++;
        }

        return answer;
    }
}
 */
