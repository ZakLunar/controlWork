package init.task;

//ToDo 4. Fibonacci (Рассчитать первых 50 чисел Фиббоначии вывести их на экран)

public class Task_4 {
    static long num1 = 0, num2 = 1, num3;
    public static void fibonacci () {
        int count = 49;

        System.out.print("First Fibonacci numbers - " + num1 + " " + num2 + " ");

        for (int i = 0; i < count; i++) {
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(num3 + " ");
        }
    }
}
