class Solution {
    public String solution(int[] numbers, String hand) {

        StringBuilder result = new StringBuilder();

        int left = 10;
        int right = 12;

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                result.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                result.append("R");
                right = num;
            } else {
                int target = (num == 0) ? 11 : num;

                int leftDist = getDistance(left, target);
                int rightDist = getDistance(right, target);

                if (leftDist < rightDist) {
                    result.append("L");
                    left = target;
                } else if (rightDist < leftDist) {
                    result.append("R");
                    right = target;
                } else {
                    if (hand.equals("left")) {
                        result.append("L");
                        left = target;
                    } else {
                        result.append("R");
                        right = target;
                    }
                }
            }
        }

        return result.toString();
    }

    private int getDistance(int from, int to) {
        int fromRow = (from - 1) / 3;
        int fromCol = (from - 1) % 3;

        int toRow = (to - 1) / 3;
        int toCol = (to - 1) % 3;

        return Math.abs(fromRow - toRow) + Math.abs(fromCol - toCol);
    }
}