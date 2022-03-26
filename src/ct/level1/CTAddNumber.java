package ct.level1;

import java.util.HashSet;

// 없는 숫자 더하기
public class CTAddNumber {

    public static int solution(int[] numbers) {
        int answer = -1;
        HashSet<Integer> set = new HashSet<>();

        for(int n : numbers) {
            set.add(n);
        }

        for(int i=1; i <10; i++) {
            if(!set.contains(i)) answer += i;
        }

        return answer;
    }
}
