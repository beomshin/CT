package ct.level2;

import java.util.ArrayList;
import java.util.Arrays;

// 교점에 별 만들기
public class CTCreateStar {

    static long maxX = Long.MIN_VALUE;
    static long minX = Long.MAX_VALUE;
    static long maxY = Long.MIN_VALUE;
    static long minY = Long.MAX_VALUE;
    static ArrayList<Long[]> points = new ArrayList<>();

    public static String[] solution(int[][] line) {
        String[] answer = {};

        for(int i=0; i < line.length; i++) {
            for(int j= i + 1; j < line.length; j++) {
                calculatePoint(line, i, j);
            }
        }

        boolean[][] t = new boolean[(int)(maxY - minY + 1)][(int)(maxX - minX + 1)];
        for(Long[] p : points) {
            int x = (int) (p[0] - minX);
            int y = (int) (p[1] - maxY);
            t[Math.abs(y)][Math.abs(x)] = true;
        }

        answer = new String[t.length];
        for(int i=0; i < t.length; i ++) {
            String s = "";
            for(int j=0 ; j <t[i].length; j++) {
                if(t[i][j]) s += "*";
                else s += ".";
            }
            answer[i] = s;
        }

        return answer;
    }

    public static void calculatePoint(int[][] line, int a1, int a2) {
        long a = line[a1][0];
        long b = line[a1][1];
        long e = line[a1][2];
        long c = line[a2][0];
        long d = line[a2][1];
        long f = line[a2][2];

        long underFormula = (a*d) - (b*c);
        long xupFormula = (b*f) - (e*d);
        long yupFormula = (e*c) - (a*f);

        if(underFormula == 0) return;

        double x = (double) xupFormula/underFormula;
        double y = (double) yupFormula/underFormula;

        if(x%1 != 0 || y%1 != 0) return;

        maxX = Math.max(maxX, (long)x);
        minX = Math.min(minX, (long)x);
        maxY = Math.max(maxY, (long)y);
        minY = Math.min(minY, (long)y);
        points.add(new Long[]{(long)x, (long)y});
    }

}
