package init.task;

//ToDo 2. Armstrong (Напишите программу для проверки является ли введенное число -числом Армстронга.
// Число Армстронга это число, значение которого равно сумме цифр, из которых оно состоит,
// возведенных в степень, равную количеству цифр в этом числе.)

public class Task_2 {
    private final int number;

    public Task_2(int number) {
        this.number = number;
    }
    public void armstrong (){

        String strEnterNumber = Integer.toString(number); //toString
        String[] array = strEnterNumber.split(""); //toArray

        double armstrong = 0;

        for (String s : array) {
            int temp = Integer.parseInt(s);
            armstrong = armstrong + Math.pow(temp, array.length);
        }

        if(armstrong == number) {
            System.out.println("Your number(" + (int) armstrong + ") is Armstrong");
        } else {
            System.out.println("Your number(" + number + ") isn't Armstrong");
        }
    }
}
