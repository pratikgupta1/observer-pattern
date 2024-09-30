public class weatherStationTest {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay d1 = new CurrentConditionDisplay(weatherData);
        TemperatureDisplay d2 = new TemperatureDisplay(weatherData);
        weatherData.setMeasurements(100,80,4f);
        weatherData.removeObserver(d1);
        weatherData.setMeasurements(100,80,4f);
        weatherData.removeObserver(d2);
        weatherData.setMeasurements(100,80,4f);
    }
}
