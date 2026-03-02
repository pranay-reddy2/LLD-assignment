public class AttendanceScanner implements ScanCapability {

    @Override
    public void scan() {
        System.out.println("Attendance scanned: present=3");
    }
}