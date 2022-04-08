package ct.level3;

import java.util.Arrays;

// 징검다리 건너기
public class CTSteppingStone {

    public static int solution(int[] stones, int k) {
        int answer = 0;

        int min = 0;
        int max = Integer.MAX_VALUE;

        while (min < max) {

            boolean flag = true;
            int mid = (min + max) / 2;

            int count = 0;
            for(int i=0 ; i < stones.length; i++) {
                if(stones[i] < mid) {
                    count++;
                    if (count >= k) {
                        flag = false;
                        break;
                    }
                }else count = 0;
            }

            if (flag) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }

        }

        return answer;
    }

}
