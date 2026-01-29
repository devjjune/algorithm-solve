class Solution {
    public int solution(int angle) {
        if (0 < angle && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (90 < angle && angle < 180) {
            return 3;
        } else {
            return 4;
        }
    }
}
// 마지막을 else if가 아닌 else로 마무리하며 오류 방지

// === 더 깔끔한 코드 (중복되는 범위 제거) ===
//class Solution {
//    public int solution(int angle) {
//        if (angle < 90) return 1;
//        if (angle == 90) return 2;
//        if (angle < 180) return 3;
//        return 4;
//    }
//}

// === switch문 활용 ===
//public int solution(int angle) {
//    return switch (angle) {
//        case 90 -> 2;
//        case 180 -> 4;
//        default -> {
//            if (angle < 90) yield 1;
//            else yield 3;
//        }
//    };
//}