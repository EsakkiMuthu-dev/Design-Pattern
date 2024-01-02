package observerPattern.exercise;

public class StatisticsObserver implements Observer {
    private double temperature;
    private double humidity;
    private double windSpeed;

   public StatisticsObserver(WeatherData weatherData)
   {
            weatherData.register(this);     
   }
    @Override
    public void update(double temperature, double humility, double windSpeed) {
        this.temperature = temperature;
        this.humidity = humility;
        this.windSpeed=windSpeed;
        display();
    }
    public void display()
    {
        System.out.println(" Temperature : " 
        +this.temperature +" Humidity:  "+this.humidity+" WindSpeed: "+this.windSpeed);
    }
    
    
}
