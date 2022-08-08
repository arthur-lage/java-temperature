package com.arthurlage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("""
                Convert to:\s
                1 - Fahrenheit to Celsius
                2 - Fahrenheit to Kelvin
                3 - Celsius to Fahrenheit
                4 - Celsius to Kelvin
                5 - Kelvin to Fahrenheit
                6 - Kelvin to Celsius
                7 - Exit
                """);

        int convertOption = scanner.nextInt();

        if(convertOption == 1) {
            System.out.println();
            System.out.print("Type temperature in Fahrenheit: ");

            double temperatureInF = scanner.nextDouble();
            long temperatureInC = converter.convertToCelsius(temperatureInF, "fahrenheit");
            System.out.println(Math.round(temperatureInF) + "F in Celsius is: " + temperatureInC + "C");
        } else if (convertOption == 2) {
            System.out.println();
            System.out.print("Type temperature in Fahrenheit: ");

            double temperatureInF = scanner.nextDouble();
            long temperatureInK = converter.convertToKelvin(temperatureInF, "fahrenheit");
            System.out.println(Math.round(temperatureInF) + "F in Kelvin is: " + temperatureInK + "K");
        } else if (convertOption == 3) {
            System.out.println();
            System.out.print("Type temperature in Celsius: ");

            double temperatureInC = scanner.nextDouble();
            long temperatureInF = converter.convertToFahrenheit(temperatureInC, "celsius");
            System.out.println(Math.round(temperatureInC) + "C in Fahrenheit is: " + temperatureInF + "F");
        }
        else if (convertOption == 4) {
            System.out.println();
            System.out.print("Type temperature in Celsius: ");

            double temperatureInC = scanner.nextDouble();
            long temperatureInK = converter.convertToKelvin(temperatureInC, "celsius");
            System.out.println(Math.round(temperatureInC) + "C in Kelvin is: " + temperatureInK + "K");
        }
        else if (convertOption == 5) {
            System.out.println();
            System.out.print("Type temperature in Kelvin: ");

            double temperatureInK = scanner.nextDouble();
            long temperatureInF = converter.convertToFahrenheit(temperatureInK, "kelvin");
            System.out.println(Math.round(temperatureInK) + "K in Fahrenheit is: " + temperatureInF + "F");
        }
        else if (convertOption == 6) {
            System.out.println();
            System.out.print("Type temperature in Kelvin: ");

            double temperatureInK = scanner.nextDouble();
            long temperatureInC = converter.convertToCelsius(temperatureInK, "kelvin");
            System.out.println(Math.round(temperatureInK) + "K in Celsius is: " + temperatureInC + "C");
        } else if (convertOption == 7) {
            System.out.println("Exiting...");
            return;
        }
    }
}
