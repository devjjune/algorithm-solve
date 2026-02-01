import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String my_string, int n) {
        
        return Stream.of(my_string.split(""))
            .map(s -> s.repeat(n))
            .collect(Collectors.joining());
    }
}