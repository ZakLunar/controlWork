package init.run;

import init.login.Login;
import init.task.*;

import java.util.Scanner;

public class Init {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LOGIN IN ===\nEnter your 'Name'");
        String logName = scanner.nextLine();
        System.out.println("Enter your 'Password'");
        String logPass = scanner.nextLine();

        int state = Login.loginTo(logName, logPass);

        if (state == 0) {
            System.out.println("END");
            return;
        } else {
            System.out.println("Please, choose the task to run and enter number of task\n 1. Even Task\n 2. Armstrong\n 3. Reverse\n 4. Fibonacci\n 5. Replace");
        }

        int task = scanner.nextInt();

        switch (task) {
            case 1 -> {
                System.out.println("Enter any integer");
                int enterNumber = scanner.nextInt();
                Task_1 num = new Task_1(enterNumber);
                num.evenNumber();
            }
            case 2 -> {
                System.out.println("Enter any integer");
                int enterNumber = scanner.nextInt();
                Task_2 num = new Task_2(enterNumber);
                num.armstrong();
            }
            case 3 -> Task_3.reverse();
            case 4 -> Task_4.fibonacci();
            case 5 -> Task_5.replace();

//                System.out.println("Enter the any word");
//                String str = scanner.nextLine();
//                //Task_5 str = new Task_5(enterStr);
//                //str.replaceChar();

            default -> System.out.println("Entered incorrect value");
        }
    }
}
