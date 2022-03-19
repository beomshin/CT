package ct.level2;

import java.util.HashMap;

// 쿼드압축 후 세기
public class CTQuadCompression {

    static boolean[][] isVisited;
    static int[][] D = {{0, 1}, {1, 0}, {1, 1}};

    public static int[] solution(int[][] arr) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        isVisited = new boolean[arr.length][arr.length];
        for(int i=0; i < arr.length; i++)  {
            for(int j=0; j <arr[i].length; j++) {
                if(isVisited[i][j] == false) {
                    int n = dfs(arr, i, j, arr[i][j], 0);
                    for(int k= i; k < i + n; k++) {
                        for(int l= j; l < j + n; l++) {
                            isVisited[k][l] = true;
                        }
                    }
                    map.put(arr[i][j], map.getOrDefault(arr[i][j], 0) + 1);
                }
            }
        }


        answer[0] = map.get(0);
        answer[1] = map.get(1);

        return answer;
    }

    public static int dfs(int[][] arr, int x, int y, int s, int l) {
       if(x < 0 || y < 0 || x > arr.length - 1 || y > arr.length - 1 || isVisited[x][y] || arr[x][y] != s) return l;

       int min = arr.length;
       for(int[] d : D) {
           min = Math.min(dfs(arr, x + d[0], y + d[1], s, l + 1), min);
       }

       return min;
    }
}
