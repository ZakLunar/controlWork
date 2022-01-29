package init.task;

//ToDo 3. Reverse (Напишите программу для переворачивания строки, изменив расположение символов в строке задом наперёд без использования встроенных в String функций.)

import java.util.Scanner;

public class Task_3 {

    public static void reverse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any word");
        String str = scanner.nextLine();

        StringBuffer reverseStr = new StringBuffer(str);
        System.out.println(reverseStr.reverse());
    }
}
