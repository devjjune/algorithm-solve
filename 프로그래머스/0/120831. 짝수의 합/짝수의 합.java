class Solution {
    public int solution(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}
/*
=== 반복문의 보폭 조절해서 성능 최적화 ===
public int solution(int n) {
    int result = 0;
    // 0부터 시작해서 2씩 더해가면, 고르는 모든 숫자가 짝수
    for (int i = 0; i <= n; i += 2) {
        result += i;
    }
    return result;
}
 */

/*
=== Java Stream 사용 (가독성, 실무) ===
import java.util.stream.IntStream;

public int solution(int n) {
    return IntStream.rangeClosed(0, n) // 0부터 n까지 숫자 생성
            .filter(i -> i % 2 == 0) // 짝수만 걸러내기
            .sum(); // 다 더하기
}
 */

/*
=== 수학 공식 (등차수열의 합) 이용 ===
public int solution(int n) {
    int k = n / 2; // n까지 짝수가 몇 개 있는지 계산
    return k * (k + 1);
}
 */