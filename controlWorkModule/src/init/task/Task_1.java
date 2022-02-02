package init.task;

//ToDo 1. Even Number (Напишите программу которая определяет, является ли число четным или нет.
// Проверять только целые числа. Добавить обработку ошибок с описанием.)

public class Task_1 {
    private final int number;

    public Task_1(int number) {
        this.number = number;
    }

    public void evenNumber(){
         if (number%2 == 0){
             System.out.println("Your number(" + number + ") is even");
         } else {
             System.out.println("Your number(" + number + ") isn't even");
         }
    }
}
