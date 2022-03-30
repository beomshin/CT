package ct.level3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

// 표 편집
public class CTEditeTable {

    class Node {
        int prev, cur, next;
        public Node(int prev, int cur, int next) {
            this.prev = prev;
            this.cur = cur;
            this.next = next;
        }
    }

    int loc;
    Node[] table;
    Stack<Node> del = new Stack<>();
    StringBuilder builder;

    public String solution(int n, int k, String[] cmd) {
        table = new Node[n];
        builder = new StringBuilder();
        for(int i=0; i < n ; i++) builder.append("O");
        for(int i=0; i < n ; i++) table[i] = new Node(i-1, i, i+1);
        table[n-1].next = -1;
        loc = k;

        for(String c : cmd) {
            String[] arr = c.split(" ");

            switch (arr[0]) {

                case "U": U(Integer.valueOf(arr[1])); break;
                case "D": D(Integer.valueOf(arr[1])); break;
                case "C": C(); break;
                case "Z": Z(); break;

            }

        }

        return builder.toString();
    }

    public void U(int n) {
        while (n-- > 0) loc = table[loc].prev;
    }

    public void D(int n) {
        while (n-- > 0) loc = table[loc].next;
    }

    public void C() {
        del.add(table[loc]);
        if (table[loc].next != -1) table[table[loc].next].prev = table[loc].prev;
        if (table[loc].prev != -1) table[table[loc].prev].next = table[loc].next;
        builder.setCharAt(loc, 'X');

        if(table[loc].next != -1) loc = table[loc].next;
        else loc = table[loc].prev;
    }

    public void Z() {
        Node node = del.pop();
        if(node.next != -1) table[node.next].prev = node.cur;
        if(node.prev != -1) table[node.prev].next = node.cur;
        builder.setCharAt(node.cur, 'O');

    }


}
