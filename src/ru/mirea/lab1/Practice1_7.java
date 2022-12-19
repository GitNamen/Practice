package ru.mirea.lab1;
import java.util.Scanner;
public class Practice1_7 {

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите число: " );
            int a = input.nextInt();
            int b = 1;
            for (int i = 1; i <= a; i++)
            {
                b= i * b;
            }
            System.out.println (a + "! = " +  b);
        }

    }

