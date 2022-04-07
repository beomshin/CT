package ct.level3;

import java.util.Arrays;

// 여행 경로
public class CTTravelRoute {

    static boolean[] vistied;
    static String[] myRoute;
    static String[] answer;
    static int N;
    public static String[] solution(String[][] tickets) {
        N = tickets.length;
        answer = new String[N+1];
        vistied = new boolean[N];
        myRoute = new String[N+1];
        myRoute[0] = "ICN";
        for(int i=0 ; i < answer.length; i++) answer[i] = "ZZZ";
        dfs("ICN", 1, tickets);
        return answer;
    }

    public static void dfs(String route, int idx, String[][] tickets) {
        if(idx > tickets.length) {
            for(int i=0 ; i < N+1; i++) {
               if(answer[i].compareTo(myRoute[i]) == 0) continue;
               else if(answer[i].compareTo(myRoute[i]) < 0) {
                   break;
               } else {
                   for(int j=0 ; j < N+1; j++) {
                       answer[j] = myRoute[j];
                   }
                   break;
               }
            }
            return;
        }

        for(int i=0 ; i < tickets.length ; i++) {

            if(vistied[i] == false && tickets[i][0].equals(route)) {
                vistied[i] = true;
                myRoute[idx] = tickets[i][1];
                dfs(tickets[i][1], idx+1, tickets);
                vistied[i] =false;
            }


        }

    }

}
