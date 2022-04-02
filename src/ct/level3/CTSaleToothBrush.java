package ct.level3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// 다단계 치솔 판매
public class CTSaleToothBrush {

    static HashMap<String, Integer> save = new HashMap<>();

    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        HashMap<String, String> tree = new HashMap<>();
        for(int i=0; i < referral.length ; i++) tree.put(enroll[i], referral[i]);

        for(int i=0 ; i < seller.length ; i++) {
            String sel = seller[i];
            int price = amount[i] * 100;

            while (!sel.equals("-")) {

                int mine = (int) Math.ceil(price * 0.9);
                int fee = (int) Math.floor(price * 0.1);

                save.put(sel, save.getOrDefault(sel, 0) + mine);

                sel = tree.get(sel);
                if(fee == 0) break;
                price = fee;
            }
        }

        for (int i=0; i < enroll.length; i++) {
            answer[i] = save.get(enroll[i]) == null ? 0 : save.get(enroll[i]);
        }

        return answer;
    }



}
