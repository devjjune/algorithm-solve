class Solution {
    public double solution(int num1, int num2) {
        double answer1 =  (double) num1 / num2;
        double answer2 = answer1 * 1000;
        return (int) answer2;
    }
}
/*
 === 권장 풀이 ===
class Solution {
    public int solution(int num1, int num2) {
        // 1. (double)로 형변환하여 소수점까지 계산 - 한 줄 전체에 순차적으로 적용
        // 2. 1000을 곱함
        // 3. 마지막에 (int)로 캐스팅하여 정수 부분만 추출
        return (int) ((double) num1 / num2 * 1000);
    }
}
 */