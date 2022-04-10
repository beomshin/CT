package ct.level3;

import java.util.LinkedList;
import java.util.Queue;

// 블록 이동하기
public class CTMoveBlock {

    static int N;
    static int answer = Integer.MAX_VALUE;
    static boolean[][][] visited;

    public static int solution(int[][] board) {
        N = board.length-1;
        visited = new boolean[N+1][N+1][2];
        bfs(board);
        return answer;
    }

    // d: 0 가로 , d:1 세로
    public static void bfs(int[][] board) {
        Queue<Node> queue = new LinkedList<Node>();


        queue.add(new Node(0,1,0,0));

        while(!queue.isEmpty()) {


            Node n = queue.poll();

            if(visited[n.x][n.y][n.d]) continue;

            visited[n.x][n.y][n.d] = true;

            if(n.x == N && n.y ==N) {
                if(n.f < answer) answer = n.f;
            }

            if(n.d == 0) {

                if(n.y+1 <= N && board[n.x][n.y+1] == 0){
                    queue.add(new Node(n.x, n.y+1, 0, n.f + 1));
                }

                if(n.y-2 >= 0 && board[n.x][n.y-2] == 0){
                    queue.add(new Node(n.x, n.y-1, 0, n.f + 1));
                }

                if(n.x+1 <= N && board[n.x+1][n.y-1] == 0 && board[n.x+1][n.y] == 0){
                    queue.add(new Node(n.x+1, n.y, 0, n.f + 1));
                    queue.add(new Node(n.x+1, n.y, 1, n.f + 1));
                    queue.add(new Node(n.x+1, n.y-1, 1, n.f +1));
                }

                if(n.x-1 >= 0 && board[n.x-1][n.y-1] == 0 && board[n.x-1][n.y] == 0){
                    queue.add(new Node(n.x-1, n.y, 0, n.f + 1));
                    queue.add(new Node(n.x, n.y-1, 1, n.f + 1));
                    queue.add(new Node(n.x, n.y, 1, n.f +1));
                }

            }else if(n.d == 1){

                if(n.x+1 <= N && board[n.x+1][n.y] == 0){
                    queue.add(new Node(n.x+1, n.y, 1, n.f + 1));
                }

                if(n.x-2 >= 0 && board[n.x-2][n.y] == 0){
                    queue.add(new Node(n.x-1, n.y, 1, n.f + 1));
                }

                if(n.y+1 <= N && board[n.x-1][n.y+1] == 0 && board[n.x][n.y+1] == 0){
                    queue.add(new Node(n.x, n.y+1, 1, n.f + 1));
                    queue.add(new Node(n.x, n.y+1, 0, n.f + 1));
                    queue.add(new Node(n.x-1, n.y+1, 0, n.f +1));
                }

                if(n.y-1 >= 0 && board[n.x-1][n.y-1] == 0 && board[n.x][n.y-1] == 0){
                    queue.add(new Node(n.x-1, n.y, 0, n.f + 1));
                    queue.add(new Node(n.x, n.y-1, 1, n.f + 1));
                    queue.add(new Node(n.x, n.y, 0, n.f +1));
                }

            }

        }


    }

    static class Node {
        int x,y,d,f;

        public Node(int x, int y, int d, int f) {
            this.x = x;
            this.y = y;
            this.d = d;
            this.f = f;
        }

    }



}
