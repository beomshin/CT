package ct.level3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

// 표 편집
public class CTEditeTable {

    static Stack<Integer> del = new Stack<>();
    static LinkedList<Integer> linkedList;
    static int loc;
    static  StringBuilder sb;

    public String solution(int n, int k, String[] cmd) {
        String answer = "";
        linkedList = new LinkedList<Integer>();
        sb = new StringBuilder();
        for (int i=0; i < n; i++) sb.append("X");
        for(int i=0 ; i < n ; i++) linkedList.add(i);
        loc = k;

        for(String c : cmd) {
            String[] arr = c.split(" ");
            switch (arr[0]) {
                case "U": u(Integer.parseInt(arr[1])); break;
                case "D": d(Integer.parseInt(arr[1])); break;
                case "C": c(); break;
                case "Z": z(); break;
            }
        }

        for(int l : linkedList) {
            sb.setCharAt(l, 'O');
        }

        answer = sb.toString();

        return answer;
    }

    public static void u(int k) {
        loc = loc - k < 0 ? 0 : loc - k;
    }

    public static void d(int k) {
        loc = loc + k > linkedList.size() - 1 ? linkedList.size() - 1  : loc + k;
    }

    public static void c() {
        if(linkedList.size() - 1 == loc) {
            loc--;
            del.add(linkedList.getLast());
            linkedList.removeLast();
        } else {
            del.add(loc);
            linkedList.remove(loc);
        }
    }

    public static void z() {
        int n = del.pop();
        if(n < loc) loc++;
        if(n <  linkedList.getFirst()) linkedList.addFirst(n);
        else if(n > linkedList.getLast()) linkedList.addLast(n);
        else {
            for(int i=1 ; i < linkedList.size(); i++) {
                if(n > linkedList.get(i)) {
                    linkedList.add(i-1, n);
                    break;
                }
            }
        }
    }


}
