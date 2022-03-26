package ct.level1;

// 약수의 개수와 덧셈
public class CTMeasure {

    public static int solution(int left, int right) {
        int answer = 0;
        for(int i=left ; i <= right; i++) {
            int n = cal(i);
            if(n%2==0) answer += i;
            else answer -= i;
        }
        return answer;
    }

    public static int cal(int n) {
        int a=0;
        for(int i=1; i <=n ; i++) {
            if(n%i == 0) a += 1;
        }

        return a;
    }

}
