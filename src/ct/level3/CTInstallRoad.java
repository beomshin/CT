package ct.level3;

import java.util.ArrayList;

// [카카오 인턴] 경주로 건설
public class CTInstallRoad {


    static int N = 0;
    static int min = Integer.MAX_VALUE;

    // 아래 0 왼 1 위 2 오 3
    public static int solution(int[][] board) {
        int answer = 0;
        N = board.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        dfs(0, 0 , board, 3, 0);
        dfs(0, 0 , board, 0, 0);
        answer = min;
        return answer;
    }


    public static void dfs(int x, int y, int[][] board, int d, int fee) {
        if(x < 0 || x > board.length -1 || y < 0 || y > board.length - 1 || board[x][y] == 1) return;

        if(x == N && y == N) {
            if(fee < min) min = fee;
        }

        board[x][y] = 1;

        dfs(x+1 , y, board, 0 , d == 0 ? fee + 100 : fee + 600);
        dfs(x-1 , y, board, 2, d == 2 ? fee + 100 : fee + 600);
        dfs(x , y+1, board, 3, d == 3 ? fee + 100 : fee + 600);
        dfs(x , y-1, board, 1, d == 1 ? fee + 100 : fee + 600);

        board[x][y] = 0;

    }

}
