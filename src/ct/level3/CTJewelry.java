package ct.level3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// [카카오 인턴] 보석 쇼핑
public class CTJewelry {

    static int size=0;
    static int min=Integer.MAX_VALUE;

    public static int[] solution(String[] gems) {
        int[] answer = new int[2];
        HashMap<String, Integer > box = new  HashMap<String, Integer>();
        HashSet<String > s = new  HashSet<String>();
        for (String str : gems) s.add(str);

        int size = s.size();
        int left = 0;
        int right = 0;

        while (right <= gems.length) {

            if(box.size() == size) {

                if(min > right - left) {
                    min = right - left;
                    answer[0] = left+1;
                    answer[1] = right;
                }

                if(box.get(gems[left]) - 1 == 0) {
                    box.remove(gems[left]);
                    if(right == gems.length) break;
                }
                else box.put(gems[left], box.get(gems[left]) - 1);

                left++;

                continue;
            }

            if(right == gems.length) break;
            box.put(gems[right], box.getOrDefault(gems[right], 0) + 1);
            right++;
        }

        return answer;
    }




}
