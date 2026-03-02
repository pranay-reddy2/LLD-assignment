public class Projector implements PowerDevice {

    @Override
    public void on() {
        System.out.println("Projector ON (HDMI-1)");
    }

    @Override
    public void off() {
        System.out.println("Projector OFF");
    }
}