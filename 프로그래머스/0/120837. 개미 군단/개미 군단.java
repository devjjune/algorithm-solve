class Solution {
    public int solution(int hp) {
        int a = hp / 5;
        hp = hp % 5;
        
        int b = hp / 3;
        hp = hp % 3;
        
        int c = hp;
        
        return a + b + c;
    }
}