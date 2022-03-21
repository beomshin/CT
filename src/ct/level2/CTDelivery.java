package ct.level2;

import java.util.*;

// 배달
public class CTDelivery {

    static int[][] table;

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        table = new int[N][N];

        for(int i=0; i < road.length; i++) {
            table[road[i][0]-1][road[i][1]-1] = road[i][2];
            table[road[i][1]-1][road[i][0]-1] = road[i][2];
        }

        for(int i=0; i < road.length; i++) {
            if(K >= bfs(0, i, N)) {
                answer++;
            }
            System.out.println();
        }

        return answer;
    }


    public static int bfs(int s, int e, int N) {
        int min = Integer.MAX_VALUE;
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer, Integer> time = new HashMap<>();
        boolean[] visited  = new boolean[N];
        searchAdj(0, queue, N);
        visited[0] = true;

        while (!queue.isEmpty()) {

            int v = queue.remove();

            if(visited[v] == false) {
                System.out.println(v+1);
                searchAdj(v, queue, N);
                visited[v] = true;
            }

        }


        return 0;
    }

    public static void searchAdj(int v, Queue<Integer> queue, int N) {

        for(int i=0; i < N; i++) {
            if(table[v][i] != 0) {
                queue.add(i);
            }
        }

    }
}
