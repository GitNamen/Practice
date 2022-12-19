package ru.mirea.lab3.Homework3_6;

//import ru.mirea.lab1.Homework4.Homework4_1.Season;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String currency;

        Converter converter=new Converter();
        Employee[] arr={new Employee("Georgy",120000),new Employee("Dmitry",8000),
                new Employee("Andrey",100000),};


        for (Shop shop:Shop.values())
        {
            System.out.println(shop.toString());
        }

            System.out.println("Чтобы изменить валюту введите её название: dollar, euro");
            currency= input.nextLine();

            for (Shop shop:Shop.values())
            {

                if(currency.equals("dollar"))
                {
                    shop.setPrice(converter.roubleToDollar(shop.getPrice()));
                    shop.setCurrency("$");
                }

                if(currency.equals("euro"))
                {
                    shop.setPrice(converter.roubleToEuro(shop.getPrice()));
                    shop.setCurrency("€");
                }

                System.out.println(shop.toString());
            }

            Report.generateReport(arr);

    }
}
