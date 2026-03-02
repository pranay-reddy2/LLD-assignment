public class Main {

    public static void main(String[] args) {

        Projector projector = new Projector();
        LightsPanel lights = new LightsPanel();
        AirConditioner ac = new AirConditioner();
        AttendanceScanner scanner = new AttendanceScanner();

        DeviceRegistry registry =
                new DeviceRegistry(projector, lights, ac, scanner);

        ClassroomController controller =
                new ClassroomController(registry);

        controller.startClass();
        controller.shutdown();
    }
}