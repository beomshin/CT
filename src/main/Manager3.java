package main;

import ct.level3.CTEditeTable;
import ct.level3.CTSaleToothBrush;

import java.util.Arrays;
import java.util.Scanner;

public class Manager3 {

    public static void level3(Scanner sc) {



        System.out.println("1. 표 편집, 2. 다단계 칫솔 판매");
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
        }

    }
}
