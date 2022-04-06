package ct.level3;

import java.util.*;

    // [카카오 인턴] 경주로 건설
public class CTInstallRoad {

    static int[][] dd = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};
    static boolean[][] visited;
    static int min = Integer.MAX_VALUE;
    static int N;
    public static int solution(int[][] board) {
        int answer = 0;
        N = board.length;
        visited = new boolean[N][N];
        bfs(board);
        answer = min;
        return answer;
    }

    public static void bfs(int[][] board) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0, 0, -1, 0));
        visited[0][0] = true;

        while (!q.isEmpty()) {

            Node n = q.poll();

            if(n.x == board.length -1 && n.y == board.length -1) {
                System.out.println(n.fee);
                min = Math.min(n.fee, min);
            }

            // 아래 0 위 1 오 2 왼 3
            for (int i=0 ; i < 4; i++) {
                int x = n.x + dd[i][0];
                int y = n.y + dd[i][1];

                if(x >= 0 && x < N  && y >= 0 && y < N   && board[x][y] != 1 ) {

                    int cost = 0;
                    if(n.d == -1 || n.d == i) cost = n.fee + 100;
                    else cost = n.fee + 600;

                    if(!visited[x][y] || board[x][y] >= cost) {
                        visited[x][y] = true;
                        board[x][y] = cost;
                        q.add(new Node(x, y, i, cost));
                    }

                }

            }
        }

    }

    static class Node {
        int x,y,d,fee;
        public Node(int x, int y, int d, int fee) {
            this.x=x;
            this.y=y;
            this.d=d;
            this.fee=fee;
        }
    }



}
