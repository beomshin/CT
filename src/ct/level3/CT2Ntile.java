package ct.level3;

// 2 x n 타일링
public class CT2Ntile {

    static int answer = 0;

    public static int solution(int n) {
        answer =0;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        for(int i=2; i < n; i++) {
            a[i] = (a[i-1] + a[i-2])%1000000007;
        }
        answer = a[n-1];
        return answer;
    }

}
