package main;

import ct.level2.CTCreateStar;
import ct.level2.CTDictionary;

import java.util.Arrays;
import java.util.Scanner;

public class Manager {


    public static void level2(Scanner sc) {



        System.out.println("1. 교점에 별 만들기, 2. 모음 사전");
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
        }

    }

}
