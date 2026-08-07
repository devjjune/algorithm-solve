import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Queue<Integer> waiting = new LinkedList<>();
        for (int w : truck_weights) waiting.offer(w);
        
        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) bridge.offer(0);
        
        int time = 0;
        int currentWeight = 0;
        
        while (!waiting.isEmpty()) {
            time++;
            
            currentWeight -= bridge.poll();
            
            if (currentWeight + waiting.peek() <= weight) {
                int truck = waiting.poll();
                bridge.offer(truck);
                currentWeight += truck;
            } else {
                bridge.offer(0);
            }
        }
        
        time += bridge_length;
        
        return time;
    }
}