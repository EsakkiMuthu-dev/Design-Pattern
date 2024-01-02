package observerPattern.exercise;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(12, 31, 37);
        DisplayObserver  displayObserver = new DisplayObserver(weatherData);
        StatisticsObserver statisticsObserver = new StatisticsObserver(weatherData);
        weatherData.setHumidity(27);
        weatherData.setTemperature(217);
        weatherData.setWindSpeed(389);
        weatherData.unRegister(statisticsObserver);
        weatherData.unRegister(displayObserver);
        weatherData.setWindSpeed(43872);
        
    }
}
