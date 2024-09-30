public class CurrentConditionDisplay implements Observer,Display{

    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temp : "+temp + " , humidity :" + humidity + " , pressure : "+ pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
