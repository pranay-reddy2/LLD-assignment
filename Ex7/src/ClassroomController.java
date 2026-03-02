public class ClassroomController {

    private final DeviceRegistry registry;

    public ClassroomController(DeviceRegistry registry) {
        this.registry = registry;
    }

    public void startClass() {

        System.out.println("=== Smart Classroom ===");

        registry.projectorPower().on();
        registry.brightness().setBrightness(60);
        registry.temperature().setTemperature(24);
        registry.scanner().scan();
    }

    public void shutdown() {

        System.out.println("Shutdown sequence:");

        registry.projectorPower().off();
        registry.lightsPower().off();
        registry.acPower().off();
    }
}