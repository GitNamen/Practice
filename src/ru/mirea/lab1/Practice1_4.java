package ru.mirea.lab1;
import java.util.Scanner;
public class Practice1_4 {
   // public static void Task() {
   public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0;
        int min=0, max=0;
        int sum=0;

        System.out.print("Введите размерность массива: ");
        int size=input.nextInt();
        int[] arr = new int[size];
        while (i!=arr.length)
        {
            System.out.print("Введите элемент массива a[" + i + "] " );
            arr[i] = input.nextInt();
            sum+=arr[i];
            i++;
        }
        i = 0;
        while (i!=arr.length)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }

            i++;
        }
        min = max;
        i = 0;

        while (i!=arr.length)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }

            i++;
        }
        System.out.print("Сумма: "+ sum+"\n");
        System.out.print("Максимальное значение: "+ max+"\n");
        System.out.print("Минимальное значение: "+ min+"\n");

    }

}

