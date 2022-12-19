package ru.mirea.lab2.lab2_1;

import java.util.Scanner;
public class TestAuthor {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            Author aut = new Author ("Georgy", "demekhin01@inbox.ru", 'M');
            System.out.println("Name: "+ aut.getName() );
            System.out.println("Gender: "+ aut.getGender() );
            System.out.println("Email: "+ aut.getEmail() );
            System.out.print("Введите email:");
            String email = input.nextLine();
            aut.setEmail(email);
            System.out.println(aut.toString());

        }
    }

