package ct.level3;

import java.util.Arrays;
import java.util.Stack;

// 표 편집
public class CTEditeTable {

    boolean[] table;
    Stack<Integer> delete = new Stack<>();
    int loc;
    int last;

    public String solution(int n, int k, String[] cmd) {
        String answer = "";
        table = new boolean[n];
        for(int i=0; i < table.length; i++) table[i] = true;
        loc = k;
        last = n-1;


        for(String c : cmd) {
            String[] s = c.split(" ");

            switch (s[0]){
                case "U": up(Integer.parseInt(s[1])); break;
                case "D": down(Integer.parseInt(s[1])); break;
                case "C": del(); break;
                case "Z": restore(); break;
            }

        }

       for (boolean b : table) {
           if(b) answer += "O";
           else answer += "X";
       }
        return answer;
    }

    public void up(int k) {
        int temp = 0;
        for(int i=loc-1 ; i >=0 ; i--){
            if(k == 0) break;

            if(table[i]) {
                temp = i;
                k--;
            }
        }
        loc = temp;
    }

    public void down(int k) {
        int temp = 0;
        for(int i=loc+1 ; i <= table.length ; i++){
            if(k == 0) break;

            if(table[i]) {
                temp = i;
                k--;
            }
        }
        loc = temp;
    }

    public void del() {
        table[loc] = false;
        delete.push(loc);
        if(loc == last) loc = last - 1;
        else loc += 1;
    }

    public void restore() {
        int s = delete.pop();
        table[s] = true;
        if(s > last) last = s;
    }
}
