package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String bin = in.nextLine();

        int number = Integer.parseInt(bin, 2);

        System.out.println("Вы ввели число " + number);

    }



}
