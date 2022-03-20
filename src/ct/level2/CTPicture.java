package ct.level2;

import java.util.ArrayList;

// 단체사진 찍기
public class CTPicture {

    static String[] P = {"A", "C", "F", "J", "M", "N", "R", "T"};
    static boolean[] isVisted = new boolean[8];
    static int answer;
    public static int solution(int n, String[] data) {
        answer = 0;
        makePicture(n, data, new ArrayList<String>());
        return answer;
    }


    public static void makePicture(int n, String[] data, ArrayList<String> line) {
        if(line.size() == 8) {
            String l = "";
            for(String s : line) {
                l += s;
            }

            for(int i =0 ; i < n; i++) {
                 String f = String.valueOf(data[i].charAt(0));
                 String s = String.valueOf(data[i].charAt(2));
                 char q = data[i].charAt(3);

                 int a = Math.abs(l.indexOf(f) - l.indexOf(s)) -1;
                 int num = Integer.valueOf(String.valueOf(data[i].charAt(4)));

                 if (q == '=' && a != num) return;
                 else if(q == '<' && a >= num) return;
                 else if(q == '>' && a <= num) return;
            }

            answer++;
            return;
        }

        for(int i =0 ; i < P.length; i++) {
            if(isVisted[i] == false) {
                isVisted[i] = true;
                line.add(P[i]);
                makePicture(n, data, line);
                line.remove(P[i]);
                isVisted[i] = false;
            }
        }

    }



}
