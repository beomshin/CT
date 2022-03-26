package main;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("레벨 : ");
            int n = Integer.valueOf(sc.nextLine());

            switch (n) {
                case 1: Manger2.level2(sc);break;
                case 2: Manager.level2(sc); break;
                default: break;
            }

        }

    }

}
