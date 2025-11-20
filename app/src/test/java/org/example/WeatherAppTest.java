package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherAppTest {

    @Mock
    private WeatherService weatherService;

    @Test
    void testGetWeatherGreeting() {
        // Arrange
        WeatherApp weatherApp = new WeatherApp(weatherService);
        when(weatherService.getCurrentWeather("New York")).thenReturn("sunny");

        // Act
        String greeting = weatherApp.getWeatherGreeting("New York");

        // Assert
        assertEquals("Hello! The current weather in New York is sunny", greeting);
    }
}