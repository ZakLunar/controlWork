package init.task;

//ToDo 2. Armstrong (Напишите программу для проверки является ли введенное число -числом Армстронга.
// Число Армстронга это число, значение которого равно сумме цифр, из которых оно состоит, возведенных в степень, равную количеству цифр в этом числе.

public class Task_2 {
    public static void armstrong (int enterNumber){

        String strNumber = Integer.toString(enterNumber);

        String[] array = strNumber.split("");

        for (int i = 0; i < array.length; i++) {

        }
//=====================
        for (String j : array){
            System.out.println(j);
        }
    }
}
