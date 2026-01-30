class Solution {
    public String solution(String my_string) {
        
        return new StringBuilder(my_string).reverse().toString();
        // 변수에 인스턴스를 담지X (재사용할 필요 없음), 메서드 체이닝 기법 활용
    }
}

/*
[ StringBuffer와 StringBuilder 클래스]
- 내부적으로 문자열 편집을 위한 버퍼(buffer)를 가지고 있어 지정된 문자열을 변경할 수 있다.
  String과 달리 문자열을 추가(append)하거나 수정해도 새로운 객체를 생성하지 않고 기존 메모리 공간을 활용한다.
- 주요 메서드: .append(), .insert(), .delete(), .reverse() 등
- 멀티스레드 환경이 아닌 일반적인 상황에서는 StringBuilder이 더 성능이 좋아 주로 사용한다.
  반면 StringBuffer은 동기화를 지원하여 멀티스레드 상황에서 안전하다.
 */