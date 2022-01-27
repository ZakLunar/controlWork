package init.task;

//ToDo 1. Even Number (Напишите программу которая определяет, является ли число четным или нет.
// Проверять только целые числа. Добавить обработку ошибок с описанием.)

import java.util.Scanner;

public class Task_1 {
    public static void evenNumber (int enterNumber){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the integer number");
//        // int enterNumber = scanner.nextInt();
         int number = enterNumber%2;
         if (number == 0){
             System.out.println("Your number is even");
         } else {
             System.out.println("Your number isn't even");
         }
    }
}
