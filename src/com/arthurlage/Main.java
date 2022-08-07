package com.arthurlage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("Convert to: \n" +
                "1 - Fahrenheit\n" +
                "2 - Celsius\n");

        int convertOption = scanner.nextInt();

        if(convertOption == 1) {
            System.out.println();
            System.out.print("Type temperature in Celsius: ");

            double temperatureInC = scanner.nextDouble();
            long temperatureInF = converter.convertToFahrenheit(temperatureInC);
            System.out.println(Math.round(temperatureInC) + "C in Fahrenheit is: " + temperatureInF + "F");
        } else if (convertOption == 2) {
            System.out.println();
            System.out.print("Type temperature in Fahrenheit: ");

            double temperatureInF = scanner.nextDouble();
            long temperatureInC = converter.convertToCelsius(temperatureInF);
            System.out.println(Math.round(temperatureInF) + "F in Celsius is: " + temperatureInC + "C");
        }

    }
}
