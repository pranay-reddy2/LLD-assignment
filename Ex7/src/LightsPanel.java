public class LightsPanel implements PowerDevice, BrightnessControl {

    @Override
    public void on() {
    }

    @Override
    public void off() {
        System.out.println("Lights OFF");
    }

    @Override
    public void setBrightness(int percent) {
        System.out.println("Lights set to " + percent + "%");
    }
}