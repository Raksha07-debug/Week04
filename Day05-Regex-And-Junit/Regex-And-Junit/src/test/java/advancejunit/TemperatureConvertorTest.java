package advancejunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConvertorTest {
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConvertor.celsiusToFahrenheit(0));
        assertEquals(212.0, TemperatureConvertor.celsiusToFahrenheit(100));
        assertEquals(98.6, TemperatureConvertor.celsiusToFahrenheit(37));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConvertor.fahrenheitToCelsius(32));
        assertEquals(100.0, TemperatureConvertor.fahrenheitToCelsius(212));
        assertEquals(37.0, TemperatureConvertor.fahrenheitToCelsius(98.6));
    }
}
