package ct.level2;

import java.util.Arrays;

// [3차] n진수 게임
public class CTNGame {

    static String[] games;

    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        games = new String[t*m];
        int idx = 1;
        int num  = 0;
        games[0] = "0";
        while (idx < t*m) {
            String s = changeNumber(num++, n);
            for(char c : s.toCharArray()) {
                if(idx < t*m) {
                    games[idx++] = String.valueOf(c);
                }
            }
        }
        for(int i= p-1 ; i < games.length; i += m) {
            answer += games[i];
        }
        return answer;
    }


    public static String changeNumber(int n, int k) {

        String s = "";
        while (n > 0) {

            int r = n % k;
            n /= k;

            if(r < 10) {
                s = r + s;
            } else {
                switch (r) {
                    case 10 : s = 'A' + s; break;
                    case 11 : s = 'B' + s; break;
                    case 12 : s = 'C' + s; break;
                    case 13 : s = 'D' + s; break;
                    case 14 : s = 'E' + s; break;
                    case 15 : s = 'F' + s; break;
                }
            }

        }

        return s;
    }

}
