package com.company;

import javax.swing.*;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        int age;
        int temperature;
        weather(age = 25, temperature = 40);
        System.out.println(weather(age = 25, temperature = 30));
        System.out.println(weather(age = 5, temperature = -30));
        System.out.println(weather(age = 55, temperature = 40));
        System.out.println(weather(age = 15, temperature = 30));
        System.out.println(weather(age = 40, temperature = 20));
    }

    public static String weather(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";

        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять ";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }


    }
}




