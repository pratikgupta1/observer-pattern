public class TemperatureDisplay implements Observer,Display{

    private float tmp;
    private Subject subject;

    public TemperatureDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("TemperatureDisplay : "+ this.tmp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.tmp = temp;
        display();
    }
}
