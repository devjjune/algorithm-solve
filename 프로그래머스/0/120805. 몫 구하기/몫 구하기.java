class Solution {
    public int solution(int num1, int num2) {
        // 조건 범위를 벗어나면 즉시 종료 (예외 처리)
        if (num1 <= 0 || num1 > 100 || num2 <= 0 || num2 > 100) {
            return 0; // or 예외를 던짐
        }

        return num1 / num2;
    }
}
// java.lang.ArithmeticException: / by zero 에 대한 예외 처리
// 제한사항이 0 < num1 ≤ 100 와 같은 경우엔 다 쪼개 써야 함