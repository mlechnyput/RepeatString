package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = scanner.nextLine();
        System.out.print("Enter the number to repeat the string :");
        int num = scanner.nextInt();
        repeat(str, num);
    }

    public static void repeat(String str, int num) {
        if (num == 0) return;
        num = num - 1;
        System.out.print(str);
        repeat(str, num);
    }

    public static String recursive() {
        return "";
    }

    public void justP() {
        System.out.println("P");
    }

}

