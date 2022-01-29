package init.task;

//ToDo 5. Replace (Написать программу, которая заменяет в исходной строке все буквы а на @. Буквы о на ноль. Выводит новую строку на экран.
// Добавить обработку длины строки, максимальная длина 30 символов. Строка может состоять из нескольких слов и любых символов)

import java.util.Scanner;

public class Task_5 {
//    private String str;
//
//    public Task_5(String str) {
//        this.str = str;
//    }


    public static void replace (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string with \"a\" and \"o\"");
        String str = scanner.nextLine();

        if(str.length() <= 30 && str.length() >= 1) {
            if (str.contains("a") || str.contains("o")) {
                str = str.replace("a", "@");
                str = str.replace("o", "0");
                System.out.println("Your improvement string xD - " + str);
            } else {
                System.out.println("Your sting aren't contain important word");
            }
        } else if (str.length() < 1) {
            System.out.println("Your string is to short");
        } else {
            System.out.println("Your string is too long. The maximum length is 30 characters");
        }
    }
}
