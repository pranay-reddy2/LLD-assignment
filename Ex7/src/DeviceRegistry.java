public class DeviceRegistry {

    private final Projector projector;
    private final LightsPanel lights;
    private final AirConditioner ac;
    private final AttendanceScanner scanner;

    public DeviceRegistry(Projector projector,
                          LightsPanel lights,
                          AirConditioner ac,
                          AttendanceScanner scanner) {

        this.projector = projector;
        this.lights = lights;
        this.ac = ac;
        this.scanner = scanner;
    }

    public PowerDevice projectorPower() {
        return projector;
    }

    public BrightnessControl brightness() {
        return lights;
    }

    public TemperatureControl temperature() {
        return ac;
    }

    public ScanCapability scanner() {
        return scanner;
    }

    public PowerDevice lightsPower() {
        return lights;
    }

    public PowerDevice acPower() {
        return ac;
    }
}