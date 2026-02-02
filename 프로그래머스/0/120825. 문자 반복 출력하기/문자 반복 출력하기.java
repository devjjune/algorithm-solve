import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String my_string, int n) {
        
        return Stream.of(my_string.split(""))
            .map(s -> s.repeat(n))
            .collect(Collectors.joining());
    }
}

/*
=== StringBuilder 활용 ===
- 단순한 흐름에서는 for문과 StringBuilder 사용하고 조건이 복잡해질 땐 Stream 사용

class Solution {
    public String solution(String my_string, int n) {

        // 결과를 담을 가변 크기의 문자열 컨테이너 생성
        StringBuilder sb = new StringBuilder();

        // 문자열을 문자 배열(char)로 변환하여 하나씩 꺼내기
        for(char c : my_string.toCharArray()){
            sb.append(String.valueOf(c).repeat(n));
        }

        // StringBuilder를 일반 String으로 변환하여 반환
        return sb.toString();
    }
}
 */