import java.util.*;

class Solution {
    public int solution(int[][] board) {
        
        int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        
        int n = board.length;
        boolean[][] danger = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < 9; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        
                        if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                            danger[nx][ny] = true;
                        }
                    }
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!danger[i][j]) {
                    count++;
                }
            }
        }
        
        return count;
    }
}