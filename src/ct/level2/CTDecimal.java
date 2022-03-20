package ct.level2;

import java.util.Arrays;

// k진수에서 소수 개수 구하기
public class CTDecimal {

    static int answer;

    public static int solution(int n, int k) {
        answer = 0;
        String s = Integer.toString(n, k);
        while (s.contains("00")) s = s.replaceAll("00", "0");
        String[] arr = s.split("0");
        for(String str : arr) check(str);
        return answer;
    }

    public static void check(String s) {
        if(s.equals("1")) return;
        long n = Long.valueOf(s);
        for(int i=2 ; i <= Math.sqrt(n); i++) {
            if(n%i ==0) return;
        }
        answer++;
    }

}
