package observerPattern.exercise;

import java.util.ArrayList;

public class WeatherData implements Subject {
    
    ArrayList<Observer> observers = new ArrayList<>();

    private double temperature;
    private double humidity;
    private double windSpeed;

    public WeatherData( double temperature, double humidity, double windSpeed)
    {
        this.temperature=temperature;
        this.humidity=humidity;
        this.windSpeed=windSpeed;
        notifyObservers();
    }

    public double getTemperature(){ return this.temperature;}
    public double getHumidity(){return this.humidity;}
    public double getWindSpeed() {return this.windSpeed;}

    //Setters
    public void setTemperature(double  temperature)
    {
        this.temperature=temperature;
        notifyObservers();
    }

    public void setHumidity(double humidity)
    {
        this.humidity=humidity;
        notifyObservers();
    }

    public void setWindSpeed(double windSpeed)
    {
        this.windSpeed=windSpeed;
        notifyObservers();
    }
    @Override
    public void register(Observer o)
    {
        observers.add(o);
        System.out.println(" Observer is registered Successfully!!");
    }

    @Override
    public void unRegister(Observer o)
    {
        observers.remove(o);
        System.out.println(" Observer  is un registered Successfully!!");
    }
    
    @Override
    public void notifyObservers()
    {
        for(Observer o: observers)
        {
            o.update(temperature, humidity, windSpeed);
        }
    }
}
