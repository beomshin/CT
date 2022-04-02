package ct.level3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

// 불량 사용자
public class CTMistrustUser {

    static boolean[] visited;
    static HashSet<String> set = new HashSet<>();

    public static int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        visited = new boolean[user_id.length];
        String[] list = new String[banned_id.length];
        dfs(user_id, banned_id, list, 0);
        answer = set.size();
        return answer;
    }

    public static void dfs(String[] user_id, String[] banned_id, String[] list, int idx) {
        if(idx == banned_id.length) {

            for(int i=0; i < banned_id.length ; i++) if(!check(list[i], banned_id[i])) return;

            String[] a = new String[list.length];
            System.arraycopy(list, 0 , a, 0 , a.length);
            Arrays.sort(a);
            String s = String.join("", a);
            set.add(s);
            return;
        }

        for(int i=0 ; i < user_id.length; i++) {
            if(visited[i] == false) {
                visited[i] = true;
                list[idx] = user_id[i];
                dfs(user_id, banned_id, list, idx + 1);
                visited[i] = false;
            }
        }

    }

    public static boolean check(String user, String ban) {
        if(user.length() != ban.length()) return false;

        for(int i=0; i < user.length() ; i++) {
            if(ban.charAt(i) == '*') continue;

            if(ban.charAt(i) != user.charAt(i)) return false;
        }

        return true;
    }



}
