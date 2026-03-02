public class AirConditioner implements PowerDevice, TemperatureControl {

    @Override
    public void on() {
    }

    @Override
    public void off() {
        System.out.println("AC OFF");
    }

    @Override
    public void setTemperature(int celsius) {
        System.out.println("AC set to " + celsius + "C");
    }
}