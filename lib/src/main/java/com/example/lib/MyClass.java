package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入數字");
        String s = scanner.next();
        for(int i=0;i<s.length();i++){
            switch (Integer.parseInt(String.valueOf(s.charAt(i)))){
                case 0:
                    System.out.print("零");
                    break;
                case 1:
                    System.out.print("壹");
                    break;
                case 2:
                    System.out.print("貳");
                    break;
                case 3:
                    System.out.print("參");
                    break;
                case 4:
                    System.out.print("肆");
                    break;
                case 5:
                    System.out.print("伍");
                    break;
                case 6:
                    System.out.print("陸");
                    break;
                case 7:
                    System.out.print("柒");
                    break;
                case 8:
                    System.out.print("捌");
                    break;
                case 9:
                    System.out.print("玖");
                    break;
            }

        }

    }
}
