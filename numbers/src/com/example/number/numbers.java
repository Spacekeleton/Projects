package com.example.number;

import java.lang.Math;
import java.util.Scanner;


public class numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите нижнюю границу");
        int min = in.nextInt();

        System.out.println("Введите верхнюю границу");
        int max = in.nextInt();

        int num = (int) (min + Math.random() * (max - min));
        if (max <min) {
            System.out.println("Ошибка");
        }
        if (max > min) {
            System.out.println(num);
            if (num < 10) {
                System.out.println("Число однозначное");
            }
            if (num < 100 && num > 9) {
                System.out.println("Число двузначное");
            }
            if (num < 1000 && num > 99) {
                System.out.println("Число трехзначное");
            }
        }

    }
}
