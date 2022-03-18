package ct.level2;

import java.util.HashMap;

// 모음사전
public class CTDictionary {

    static HashMap<String, Integer> dictionary = new HashMap<>();
    static String[] words = {"A", "E", "I", "O", "U"};
    static int C = 1;

    public static int solution(String word) {
        int answer = 0;
        dfs("");
        return dictionary.get(word);
    }

    public static void dfs(String s) {
        if(s.length() == 5) return;


        for (String word : words ) {
            String a = s+ word;
            dictionary.put(a, C++);
            dfs( a);
        }

    }
}
