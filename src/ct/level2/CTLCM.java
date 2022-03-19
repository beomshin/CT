package ct.level2;

// N개의 최소공배수
public class CTLCM {

    public static int solution(int[] arr) {
        int answer = 2;
        while (true) {
            boolean flag = true;
            for(int n : arr) {
                if(answer%n != 0) flag = false;
            }
            if(flag) {
                break;
            }
            answer++;
        }
        return answer;
    }

}
