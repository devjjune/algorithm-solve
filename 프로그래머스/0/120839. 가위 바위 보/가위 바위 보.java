class Solution {
    public String solution(String rsp) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            switch (rsp.charAt(i)) {
                case '2':
                    result.append("0");
                    break;

                case '0':
                    result.append("5");
                    break;

                case '5':
                    result.append("2");
                    break;
            }
        }

        return result.toString();
    }
}

// --- switch로 분기하지 않고 미리 대응표를 만들어두고 찾는 방식
// 문자열 매핑
Class Solution {
    public String solution(String rsp) {
        String answer = "";

        for (char c : rsp.toCharArray()) {
            answer += c == '2' ? '0' : c == '0' ? '5' : '2';
            // answer.append(c == '2' ? '0' : c == '0' ? '5' : '2');
        }
        return answer;
    }
}
// 문자를 배열 인덱스로 매핑
class Solution {
    public String solution(String rsp) {
        String[] win = {"5", "0", "2"};
        StringBuilder result = new StringBuilder();

        for (char c : rsp.toCharArray()) {
            result.append(win[c - '0']); // c - '0' : 문자를 숫자로 바꾸 (배열 인덱스로 사용 가능)
        }

        return result.toString();
    }
}