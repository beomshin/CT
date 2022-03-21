package ct.level2;

import java.util.Arrays;
import java.util.HashSet;

// 전화번호 목록
public class CTPhone {

    public static boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();
        Arrays.sort(phone_book);
        for(String p : phone_book) set.add(p);
        for(String p :phone_book) {
            for(int i=0; i < p.length(); i++) {
                if(set.contains(p.substring(0, i))){
                    return false;
                }
            }
        }
        return true;
    }

}
