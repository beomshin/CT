package ct.level2;

public class CTEatTheGround {

    public static int solution(int[][] land) {
        int answer = 0;
        int round = 1;

        while (round < land.length) {


            for(int i=0; i < 4; i++) {
                int max = 0;

                for(int j=0; j < 4; j++) {
                    if(j==i) continue;
                    max = Math.max(max, land[round-1][j]);
                }
                land[round][i] = land[round][i] +max;
                answer = Math.max(answer, land[round][i]);
            }

            round++;
        }


        return answer;
    }

}
