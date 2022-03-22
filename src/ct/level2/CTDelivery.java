package ct.level2;

import java.util.*;

// 배달
public class CTDelivery {

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[] d = dijkstra(road, 1, N);
        for(int n : d) if(K >= n) answer++;
        return answer;
    }

    public static int[] dijkstra(int[][] road, int start, int N) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[] visited = new boolean[N+1];
        int[][] t = new int[N+1][N+1];
        int[] dist = new int[N+1];
        for(int i=0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        for(int i=0; i < road.length; i++) {
            if(t[road[i][0]][road[i][1]] == 0 || t[road[i][0]][road[i][1]] > road[i][2]) t[road[i][0]][road[i][1]] = road[i][2];
            if(t[road[i][1]][road[i][0]] == 0 || t[road[i][1]][road[i][0]] > road[i][2]) t[road[i][1]][road[i][0]] = road[i][2];
        }

        dist[start] = 0;
        queue.add(new int[]{start, 0});

        while (!queue.isEmpty()) {

            int[] v = queue.poll();
            int n = v[0];

            for(int i=0 ; i < t.length ; i ++) {
                if(t[n][i] !=0 && dist[i] > v[1] + t[n][i]) {
                    queue.add(new int[]{i, v[1] + t[n][i]});
                    dist[i] = v[1] + t[n][i];
                }
            }

        }

        return dist;

    }

}
