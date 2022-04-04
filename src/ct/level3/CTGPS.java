package ct.level3;

import java.util.Arrays;

public class CTGPS {

    public static int solution(int n, int m, int[][] edge_list, int k, int[] gps_log){
        int anwser = 0;
        int[][] round = new int[k][n+1];
        boolean[][] road = new boolean[n+1][n+1];
        int[][] dp = new int[k][n+1];
        for(int i=0 ; i < edge_list.length; i++) {
            int a1 = edge_list[i][0];
            int a2 = edge_list[i][1];
            road[a1][a2] = true;
            road[a2][a1] = true;
        }
        for(int i=0; i < dp.length ; i++) Arrays.fill(dp[i], Integer.MAX_VALUE - 1);

        dp[0][gps_log[0]] = 0;

        for(int i=1 ; i < k ; i++) {
            for(int j=1; j < n+1; j++) {

                for(int u=1; u < n+1; u++) {
                    if(road[j][u]) {
                        dp[i][j] = Math.min(dp[i][j], dp[i-1][u]);
                    }
                }

                dp[i][j] = Math.min(dp[i][j], dp[i-1][j]);

                if(gps_log[i] != j) dp[i][j]++;

            }
        }

        anwser = dp[k-1][gps_log[k-1]];

        return anwser == Integer.MAX_VALUE-1 ? -1 : anwser;
    }

}
