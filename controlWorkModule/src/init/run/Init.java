package init.run;

import init.login.Login;
import init.task.Task_1;
import init.task.Task_2;

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
        } else {
            System.out.println("Enter the any integer");
        }
        int enterNumber = scanner.nextInt();
        System.out.println("Please, choose the task to run and enter number of task\n 1. Even Task\n 2. Armstrong\n 3. Reverse\n 4. Fibonacci\n 5. Replace");
        int task = scanner.nextInt();


        switch (task) {
            case 1 -> Task_1.evenNumber(enterNumber);
            case 2 -> Task_2.armstrong(enterNumber);
//            case 3 -> Task_3.class;
//            case 4 -> Task_4.class;
//            case 5 -> Task_5.class;
        }
    }
}
