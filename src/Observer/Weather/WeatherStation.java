package Observer.Weather;

import Observer.Weather.Display.CurrentConditionsDisplay;
import Observer.Weather.Display.ForeCastDisplay;
import Observer.Weather.Display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherData);

        weatherData.setMeasurements(80, 60, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);

        System.out.println();
        weatherData.removeObserver(foreCastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
