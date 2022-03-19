package ct.level2;

import java.util.HashMap;

// 쿼드압축 후 세기
public class CTQuadCompression {

    static int[] answer = new int[2];

    public static int[] solution(int[][] arr) {
        checkQuad(arr, 0 ,0 , arr.length);
        return answer;
    }

    public static void checkQuad(int[][] arr, int x, int y, int n) {
        if(n == 1) {
            answer[arr[x][y]]++;
            return;
        }

        if(isBlock(arr, x, y, n)) return;

        int len = n / 2;
        checkQuad(arr, x, y , len);
        checkQuad(arr, x + len, y,  len);
        checkQuad(arr, x, y + len,  len);
        checkQuad(arr, x + len, y + len,  len);


    }

    public static boolean isBlock(int[][] arr, int x, int y, int n) {
        for(int i=x; i < x + n; i++) {
            for(int j=y; j < y + n; j++) {
                if(arr[x][y] != arr[i][j]) return false;
            }
        }

        answer[arr[x][y]]++;
        return true;
    }
}
