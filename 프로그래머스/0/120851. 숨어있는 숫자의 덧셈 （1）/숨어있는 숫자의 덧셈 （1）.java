class Solution {
    public int solution(String my_string) {
        
        return my_string.chars() // 1. 아스키 번호 흐름 생성 [97(글자 a), 49(글자 1) ...]
            .filter(Character :: isDigit) // 2. 숫자에 해당하는 번호만 통과 [49, ...]
            .map(Character :: getNumericValue) // 3. 번호를 진짜 숫자로 변환 [1, ...]
            .sum(); // 4. 흐름에 있는 모든 숫자를 더함
    }
}