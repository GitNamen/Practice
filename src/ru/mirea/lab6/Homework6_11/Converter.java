package ru.mirea.lab6.Homework6_11;

public class Converter implements IConverter
{
    @Override
    public float convert(float farengeit) {
        float converted = (float) 5/9*(farengeit - 32);
        return converted;
    }
}
