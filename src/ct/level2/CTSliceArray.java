package ct.level2;

import java.util.Arrays;

// n^2 배열 자르기
public class CTSliceArray {

    public static int[] solution(int n, long left, long right) {
        int[] answer = {};
        String s = "";
        for(int i=0; i < n ; i++) {
            for(int j=0 ; j < n ; j ++) {
                long p = (n * i) + j;
                if(p >= left && p <= right) {
                    s += (Math.max(i, j) + 1) + "";
                }
            }
        }

        System.out.println(s);

        return answer;
    }

}
