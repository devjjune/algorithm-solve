class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int row = 0; //세로
        int col = 0; //가로
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    row = i;
                    col = j;
                    break;
                }
            }
            if (park[row].charAt(col) == 'S') break;
        }
        
        for (String s : routes) {
            
            String[] route = s.split(" ");
            String dir = route[0];
            int steps = Integer.parseInt(route[1]);
            
            int tempRow = row;
            int tempCol = col;
            boolean isOk = true;
            
            for (int i = 0; i < steps; i++) {
                if (dir.equals("E")) tempCol ++;
                else if (dir.equals("W")) tempCol--;
                else if (dir.equals("S")) tempRow++;
                else if (dir.equals("N")) tempRow--;
                
                if (tempRow < 0 || tempRow >= park.length || tempCol < 0 || tempCol >= park[0].length()) {
                    isOk = false;
                    break;
                }
                
                if (park[tempRow].charAt(tempCol) == 'X') {
                    isOk = false;
                    break;
                }
            }
            
            if (isOk) {
                row = tempRow;
                col = tempCol;
            }
            
        }
        
        return new int[]{row, col};
    }
}