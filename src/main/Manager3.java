package main;

import ct.level3.*;

import java.util.Arrays;
import java.util.Scanner;

public class Manager3 {

    public static void level3(Scanner sc) {



        System.out.println("1. 표 편집, 2. 다단계 칫솔 판매, 3. 불량 사용자, 4. GPS, 5. [카카오 인턴] 보석 쇼핑");
        System.out.println("6. [카카오 인턴] 경주로 건설");
        System.out.print("번호 : ");
        int n = Integer.valueOf(sc.nextLine());

        switch (n) {
            case 1: {
                String[] s1 = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
                System.out.println(new CTEditeTable().solution(8, 2, s1));
                break;
            }
            case 2 : {
                String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
                String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
                String[] seller = {"young", "john", "tod", "emily", "mary"};
                int[] amount = {12, 4, 2, 5, 10};
                System.out.println(Arrays.toString(CTSaleToothBrush.solution(enroll, referral, seller, amount)));
                break;
            }
            case 3: {
                String[] users = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
                String[] banned =  {"fr*d*", "*rodo", "******", "******"};
                System.out.println(CTMistrustUser.solution(users, banned));
                break;
            }
            case 4: {
                int[][] edge = {{1, 2}, {1, 3}, {2, 3}, {2, 4}, {3, 4}, {3, 5}, {4, 6}, {5, 6}, {5, 7}, {6, 7}};
                int[] gps = {1, 2, 3, 3, 6, 7};
                System.out.println(CTGPS.solution(7, 10, edge, 6, gps));
            }
            case 5: {
                String[] s3 = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
                System.out.println(Arrays.toString(CTJewelry.solution(s3)));
                break;
            }
            case 6: {
                int[][] s4 = {{0,0,0},{0,0,0},{0,0,0}};
                System.out.println(CTInstallRoad.solution(s4));
                break;
            }
        }

    }
}
