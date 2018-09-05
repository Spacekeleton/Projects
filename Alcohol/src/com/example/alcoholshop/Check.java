package com.example.alcoholshop;
import java.util.Scanner;

public class Check {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество средств");
        int mny = in.nextInt();
        System.out.println("Введите возраст");
        int age = in.nextInt();
        System.out.println("Введите количество наглости");
        int ins = in.nextInt();
        if (mny < 20 && age < 21){
            System.out.println("Неподходящий возраст и нехватка средств");
        }
        else if (mny < 20 && ins < 7){
            System.out.println("Нужно больше наглости и денег");
        }
        else if (age < 21 && ins < 7){
            System.out.println("Не хватает наглости и неподходящий возраст");
        }
        else if (age < 21 && ins < 7 && mny < 20){
            System.out.println("Не ваш день");
        }
        else{
            System.out.println("Покупка удачна");
        }
    }
}
