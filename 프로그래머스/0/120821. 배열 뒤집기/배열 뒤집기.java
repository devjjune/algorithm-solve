class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length]; // 1. 똑같은 크기의 배열 생성
        
        for (int i = 0; i < num_list.length; i ++) {
            // 2. 새 배열의 앞쪽부터, 원본 배열의 뒤쪽 원소를 하나씩 넣음
            answer[i] = num_list[num_list.length - 1 - i];
        }
        
        return answer;
    }
}

// 배열 vs 리스트: 크기가 정해져 있다면 처음부터 배열을 선언해서 푸는 것이 자바에서는 훨씬 편하고 성능도 좋다