package init.task;

//ToDo 3. Reverse (Напишите программу для переворачивания строки, изменив расположение символов в строке задом наперёд без использования встроенных в String функций.)

import java.util.Scanner;

public class Task_3 {

    public static void reverse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any word");
        String str = scanner.nextLine();

        for (int i = str.length()-1; i >= 0; i--) {
            String ch = String.valueOf(str.charAt(i));
            System.out.print(ch);
        }
    }
}
