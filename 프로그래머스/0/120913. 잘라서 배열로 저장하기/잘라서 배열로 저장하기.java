import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
         
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i += n) { // i++가 아니라 n씩 증가
            result.add(my_str.substring(i, Math.min(my_str.length(), i + n)));
            // i ~ i+n 구간을 자르고 싶은데 i+n가 전체 문자열 길이의 범위를 넘을 수 있음
            // my_str.length()와 i+n 비교해서 더 작은 인덱스까지 자름
        }
        
        return result.toArray(new String[0]); // new String[0]로 반환 타입 지정, 그냥 toArray()하면 Object[]로 반환됨
    }
}