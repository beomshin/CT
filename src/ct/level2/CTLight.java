package ct.level2;

import java.util.ArrayList;

// 빛의 경로 사이클
public class CTLight {

    static int[] dr = {1, 0, -1 , 0};
    static int[] dc = {0, -1, 0 , 1};
    static boolean[][][] light;
    static int R;
    static int C;

    public static int[] solution(String[] grid) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        R = grid.length;
        C = grid[0].length();
        light = new boolean[R][C][4];

        for(int i=0; i < grid.length ; i++) {
            for(int j=0 ; j < grid[i].length(); j++) {
                for(int k=0; k < 4; k++) {
                   if(light[i][j][k] == false) {
                        list.add(makeCycle(grid, i, j ,k));
                   }
                }
            }
        }
        return list.stream().sorted().mapToInt(i -> i).toArray();
    }

    public static int makeCycle(String[] grid, int r, int c, int d) {

        int cnt = 0;

        while (true){

            if(light[r][c][d]) break;

            cnt++;
            light[r][c][d] = true;
            char a = grid[r].charAt(c);

            switch (a) {
                case 'L': {
                    d = d == 0 ? 3 : d - 1;
                    break;
                }
                case 'R': {
                    d = d == 3 ? 0 : d + 1;
                    break;
                }
            }

            r = (r + dr[d] + R) %R;
            c = (c + dc[d] + C) %C;


        }

        return cnt;
    }

}
