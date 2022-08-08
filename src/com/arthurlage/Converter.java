package com.arthurlage;

import java.lang.Math;

public class Converter {
    public static long convertToFahrenheit(double temperature, String from) {
        if(from.equals("kelvin")) {
            return Math.round((temperature - 273.15) * 9/5 + 32);
        } else if (from.equals("celsius")) {
            return Math.round((temperature * 9 / 5) + 32);
        } else {
            return 0;
        }
    }

    public static long convertToCelsius(double temperature, String from) {
        if(from.equals("fahrenheit")) {
            return Math.round((temperature - 32) * 5/9);
        } else if (from.equals("kelvin")) {
            return Math.round(temperature - 273.15);
        } else {
            return 0;
        }
    }

    public static long convertToKelvin(double temperature, String from) {
        if(from.equals("fahrenheit")) {
            return Math.round((temperature - 32) * 5/9 + 273.15);
        } else if (from.equals("celsius")) {
            return Math.round(temperature + 273.15);
        } else {
            return 0;
        }
    }
}
