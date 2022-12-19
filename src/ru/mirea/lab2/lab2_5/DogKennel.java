package ru.mirea.lab2.lab2_5;

public class DogKennel {
    public static Dog[] dogsArray = new Dog[0];

    public static void main(String[] args){



        Dog[] dogsIncomingArray = {
                new Dog("Шарик",6),
                new Dog("Бобик",3),
                new Dog("Рэкс",2)
        };
        AddDog(dogsIncomingArray);

        for (Dog dog: dogsArray) {
            System.out.println(dog.ToString());
        }

    }

    public static void AddDog(Dog[] newDogs)
    {
        Dog[] newDogsArray = new Dog[dogsArray.length + newDogs.length];

        int counter = 0;
        for (Dog dog : dogsArray)
        {
            newDogsArray[counter] = dog;
            counter++;
        }

        for (Dog newDog : newDogs)
        {
            newDogsArray[counter] = newDog;
            counter++;
        }

        dogsArray = newDogsArray;
    }


}
