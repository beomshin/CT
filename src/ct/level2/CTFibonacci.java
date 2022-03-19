package ct.level2;

// 피보나치 수
public class CTFibonacci {

    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2 ; i < n+1; i++) {
            int num = arr[i-1] + arr[i-2];
            arr[i] = num % 1234567;
        }
        answer = arr[n];
        return answer;
    }

    public static int cal(int n) {
        if(n == 0 || n == 1) return n;
        return cal(n-1) + cal(n - 2) ;
    }

}
