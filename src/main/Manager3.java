package main;

import ct.level3.CTEditeTable;

import java.util.Scanner;

public class Manager3 {

    public static void level3(Scanner sc) {



        System.out.println("1. 표 편집");
        System.out.print("번호 : ");
        int n = Integer.valueOf(sc.nextLine());

        switch (n) {
            case 1: {
                String[] s1 = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
                System.out.println(new CTEditeTable().solution(8, 2, s1));
            }
        }

    }
}
