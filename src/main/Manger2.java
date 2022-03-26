package main;

import ct.level1.CTAddNumber;
import ct.level1.CTMeasure;
import ct.level1.CTMinimumRectangle;
import ct.level1.CTYinAndYang;
import ct.level2.*;

import java.util.Arrays;
import java.util.Scanner;

public class Manger2 {

    public static void level2(Scanner sc) {



        System.out.println("1. 없는 숫자 더하기 2. 음양 더하기 3. 약수의 개수와 덧셈 4. 최소직사각형");
        System.out.print("번호 : ");
        int n = Integer.valueOf(sc.nextLine());
        
        switch (n) {

            case 1 :
                int[] s= {1,2,3,4,6,7,8,0};
                System.out.println(CTAddNumber.solution(s));
                break;
            case 2:
                int[] s2= {4,7,12};
                boolean[] s3 = {true,false,true};
                System.out.println(CTYinAndYang.solution(s2, s3));
                break;
            case 3:
                System.out.println(CTMeasure.solution(13,17));
                break;
            case 4:
                int[][] s4 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
                System.out.println(CTMinimumRectangle.solution(s4));
                break;
        }

    }
}
