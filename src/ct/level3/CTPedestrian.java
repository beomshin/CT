package ct.level3;

// 보행자 천국
public class CTPedestrian {

    static int MOD = 20170805;

    // 0 1 2 3
    public static int solution(int m, int n, int[][] cityMap) {
        int answer = 0;
        int[][][] dp = new int[m+1][n+1][2];

        dp[1][1][0] = 1;
        dp[1][1][1] = 1;

        for(int i=1; i <= m; i++) {
            for(int j=1; j <=n; j++) {
                int flag = cityMap[i-1][j-1];
                if(flag == 0) {
                    dp[i][j][0] += (dp[i-1][j][0] + dp[i][j-1][1])%MOD;
                    dp[i][j][1] += (dp[i-1][j][0] + dp[i][j-1][1])%MOD;
                }else if(flag == 1){
                    dp[i][j][0] = 0;
                    dp[i][j][1] = 0;
                }else if(flag == 2){
                    dp[i][j][0] = dp[i-1][j][0];
                    dp[i][j][1] = dp[i][j-1][1];
                }
            }
        }


        answer = dp[m][n-1][1] + dp[m-1][n][0];
        return answer;
    }



}
