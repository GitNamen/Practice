package ru.mirea.lab6.Homework6_6_9;

import java.util.Random;

public class Shop implements Printable
{
    public void print()
    {
        System.out.print(String.format("Журнал под номером: %s\n",  new Random().nextInt(10)));
    }
}