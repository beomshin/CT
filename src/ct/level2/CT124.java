package ct.level2;

// 124 나라의 숫자
public class CT124 {


    public static String solution(int n) {
        String answer = "";
        answer = make(n);
        return answer;
    }

    public static String make(int n) {
        String s= "";
        while (n > 0) {
            int k = n%3;
            if(k == 0) n--;
            n /= 3;
            if(k == 1) s = "1" + s;
            else if(k == 2) s = "2" + s;
            else s = "4" + s;
        }
        return s;
    }
}
