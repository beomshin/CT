package main;

import ct.level2.*;

import java.util.Arrays;
import java.util.Scanner;

public class Manager {


    public static void level2(Scanner sc) {



        System.out.println("1. 교점에 별 만들기, 2. 모음 사전, 3. 점프와 순간이동, 4. n^2배열 자르기, 5. 쿼드압축 후 개수 세기");
        System.out.println("6. JadenCase 문자열 만들기 7. 피보나치 수 8. N개의 최소공배수 9, [3차] n진수 게임");
        System.out.println("10. 땅따먹기 11. k진수에서 소수 개수 구하기 12. 양궁대회 13. 단체 사진 찍기 14. 124 나라의 숫자");
        System.out.println("15. 빛의 경로 사이클 16. 전화번호 목록 17, 배달 18, 위장");
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
                break;
            case 11:
                System.out.println(CTDecimal.solution(110011, 10));
                break;
            case 12:
                int[] s5 = {0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1};
                System.out.println(Arrays.toString(CTArchery.solution(9, s5)));
                break;
            case 13:
                String[] data = {"N~F=0", "R~T>2"};
                System.out.println(CTPicture.solution(2, data));
                break;
            case 14:
                System.out.println(CT124.solution(6));
                break;
            case 15:
                String[] s6 = {"SL","LR"};
                System.out.println(Arrays.toString(CTLight.solution(s6)));
                break;
            case 16:
                String[] s7 = {"119", "97674223", "1195524421"};
                System.out.println(CTPhone.solution(s7));
                break;
            case 17:
                int[][] s8 = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
                System.out.println(CTDelivery.solution(5, s8, 3));
                break;
            case 18:
                String[][] s9 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
                System.out.println(CTCamouflage.solution(s9));
                break;
        }

    }

}
