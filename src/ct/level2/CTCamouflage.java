package ct.level2;

import java.util.ArrayList;
import java.util.HashMap;

// 위장
public class CTCamouflage {

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> box = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < clothes.length; i++) {
            box.put(clothes[i][1], box.getOrDefault(clothes[i][1], 0) + 1);
        }

        for(String key : box.keySet()){
            answer *= (box.get(key) + 1); // 안입는경우 + 1
        }

        return answer - 1; // 옷을 하나도 입지않응경우 -1
    }
}
