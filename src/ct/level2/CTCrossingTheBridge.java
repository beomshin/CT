package ct.level2;

import java.util.LinkedList;
import java.util.Queue;

//다리를 지나는 트럭
public class CTCrossingTheBridge {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int curWeight = 0;
        int curTime = 0;
        Queue<int[]> bridge = new LinkedList<>();
        Queue<Integer> wait = new LinkedList<>();
        for(int truck : truck_weights ) wait.add(truck);


        while (!bridge.isEmpty() || !wait.isEmpty()) {

            curTime++;

            while (!bridge.isEmpty() && curTime - bridge.peek()[1] >= bridge_length) {
                int[] a = bridge.poll();
                curWeight -= a[0];
            }

            if(wait.isEmpty()) {
                continue;
            }

            if(weight < curWeight + wait.peek()) {
                continue;
            }

            int b = wait.poll();
            bridge.add(new int[]{b, curTime});
            curWeight += b;

        }


        return curTime;
    }
}
