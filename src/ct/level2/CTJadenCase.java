package ct.level2;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;

//JadenCase 문자열 만들기
public class CTJadenCase {

    public static String solution(String s) {
        String answer = "";
        boolean flag = true;
        for(char c: s.toCharArray()) {
            answer += flag ? String.valueOf(c).toUpperCase() : String.valueOf(c).toLowerCase();
            flag = c == ' ' ? true : false;
        }

        return answer;
    }

}
