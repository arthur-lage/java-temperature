package com.arthurlage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Math;

public class Converter {
    public static long convertToFahrenheit(double temperatureInCelsius) {
        return Math.round((temperatureInCelsius * 9/5) + 32);
    }

    public static long convertToCelsius(double temperatureInFahrenheit) {
        return Math.round((temperatureInFahrenheit - 32) * 5/9);
    }
}
