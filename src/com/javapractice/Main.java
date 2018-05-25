package com.javapractice;

import com.google.gson.Gson;

/**
 * Created by Advay on 25-05-2018.
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person("David", "Smith", 40);
        System.out.println(person);

        Gson gsonPerson= new Gson();
        System.out.println(gsonPerson.toJson(person));

        String[] colors = new String[]{"Red", "Green", "Blue"};
        for (String color : colors) {
            System.out.println("The color is " + color);
        }
        Gson gsonColor= new Gson();
        System.out.println(gsonColor.toJson(person));
    }
}
