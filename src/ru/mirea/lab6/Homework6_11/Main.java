package ru.mirea.lab6.Homework6_11;

public class Main
{
    public static void main(String args[])
    {
        float converted = new Converter().convert(-40);
        System.out.println(String.format("%.2f C",converted));
    }
}
