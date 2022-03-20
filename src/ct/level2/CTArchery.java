package ct.level2;

import java.util.Arrays;

// 양궁대회
public class CTArchery {

    static int LION_SCORE = 0;
    static int[] answer;

    public static int[] solution(int n, int[] info) {
        answer = new int[]{-1};
        calScore(0, n, info, new int[info.length]);
        return answer;
    }

    public static void calScore(int idx, int n, int[] apache, int[] lion) {
        if(idx == apache.length) {
            int sum = 0;

            if(n > 0) {
                for(int i= lion.length-1; i >=0 ; i--) {
                    if(lion[i] == 0) {
                        lion[i] = n;
                        break;
                    }
                }
            }

            for(int i=0 ; i < idx; i++) {
                if(lion[i] == 0 && apache[i] == 0) continue;
                if(lion[i] > apache[i]) sum += 10 -i;
                else sum -= 10 -i;
            }

            if(LION_SCORE < sum) {
                LION_SCORE = sum;
                answer = new int[apache.length];
                System.arraycopy(lion, 0 , answer, 0, answer.length);
            } else if(LION_SCORE == sum && sum != 0) {
                for(int i = lion.length - 1 ; i >=0 ; i--) {
                    if(lion[i] == 0 && answer[i] != 0) break;
                    if(lion[i] !=0 && lion[i] > answer[i]) {
                        answer = new int[apache.length];
                        System.arraycopy(lion, 0 , answer, 0, answer.length);
                    }
                }
            }

            return;
        }

        if(n > apache[idx]) {
            lion[idx] = apache[idx] + 1;
            calScore(idx+1, n - lion[idx] , apache, lion);
        }

        lion[idx] = 0;
        calScore(idx +1, n, apache, lion);

    }


}
