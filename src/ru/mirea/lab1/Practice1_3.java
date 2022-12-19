package ru.mirea.lab1;
import java.util.Scanner;
public class Practice1_3 {
   public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);

        int[] myArray = new int[5];
        int sum = 0;
        int am;
        System.out.print("Введите 5 чисел: \n");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
            sum = sum + myArray[i];
        }
        am = sum / myArray.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + am);
    }}

