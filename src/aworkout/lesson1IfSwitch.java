package aworkout;
import java.util.Scanner;
public class lesson1IfSwitch {
    public static void main (String[] args){
        Scanner num = new Scanner(System.in);
        int first,second = 5;
        boolean isTrue = true;
        System.out.print("Введите число: ");
        first = num.nextInt();

        if (first > second && isTrue) {
            System.out.print("Вы ввели число > 5 \n");}
        else if (first == 3)    {
            System.out.print ("Вы ввели 3");
        } else {
            System.out.print ("Введено иное число: " + first);
        }


// 2 вариант записи
        switch (first) {       // проверка числа
            case 100:
                System.out.print("Number = 100");
                break;
            case 50:
                System.out.print("Number = 100");
                break;
            case 90:
                System.out.print("Number = 100");
                break;
            default: // Замена else
                System.out.print("Неробит(");
        }
    }



}
