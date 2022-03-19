package main;

import ct.level2.*;

import java.util.Arrays;
import java.util.Scanner;

public class Manager {


    public static void level2(Scanner sc) {



        System.out.println("1. 교점에 별 만들기, 2. 모음 사전, 3. 점프와 순간이동, 4. n^2배열 자르기, 5. 쿼드압축 후 개수 세기");
        System.out.println("6. JadenCase 문자열 만들기 7. 피보나치 수 8. N개의 최소공배수 9, [3차] n진수 게임");
        System.out.println("10. 땅따먹기");
        System.out.print("번호 : ");
        int n = Integer.valueOf(sc.nextLine());

        switch (n) {

            case 1 :
                int[][] s = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
                System.out.println(Arrays.toString(CTCreateStar.solution(s)));
                break;
            case 2:
                System.out.println(CTDictionary.solution("AAAAE"));
                break;
            case 3:
                System.out.println(CTJumpTeleportation.solution(5000));
                break;
            case 4:
                System.out.println(Arrays.toString(CTSliceArray.solution(4,7,14)));
                break;
            case 5:
                int[][] s2 = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
                System.out.println(Arrays.toString(CTQuadCompression.solution(s2)));
                break;
            case 6:
                System.out.println(CTJadenCase.solution("3people unFollowed me"));
                break;
            case 7:
                System.out.println(CTFibonacci.solution(5));
                break;
            case 8:
                int[] s3 = {2,6,8,14};
                System.out.println(CTLCM.solution(s3));
                break;
            case 9:
                System.out.println(CTNGame.solution(2,4,2,1));
                break;
            case 10:
                int[][] s4 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
                System.out.println(CTEatTheGround.solution(s4));
        }

    }

}
