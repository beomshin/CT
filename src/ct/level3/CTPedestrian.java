package ct.level3;

// 보행자 천국
public class CTPedestrian {

    static int MOD = 20170805;
    static int answer = 0;
    static int X,Y;
    static boolean[][] visited;

    // 0 1 2 3
    public static int solution(int m, int n, int[][] cityMap) {
        X = m-1;
        Y = n-1;
        visited = new boolean[m][n];
        dfs(0,0, -1, cityMap);
        return answer%MOD;
    }

    public static void dfs(int x, int y, int d, int[][] cityMap) {
        if(x < 0 || x > X || y < 0 || y > Y || cityMap[x][y] == 1 || visited[x][y]) return;
        if(x == X && y== Y) {
            answer++;
        }

        visited[x][y] = true;

        if(cityMap[x][y] == 2) {

            if(d==0) dfs(x+1, y, 0 , cityMap); // 아래
            else if(d==1) dfs(x, y+1, 1 , cityMap); // 옆

        } else if(cityMap[x][y] == 0){

            dfs(x+1, y, 0 , cityMap);
            dfs(x, y+1, 1 , cityMap);
        }

        visited[x][y] = false;

    }


}
