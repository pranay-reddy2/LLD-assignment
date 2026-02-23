public class FakeDBRepository implements StudentRepository {
    private final FakeDb db;

    public FakeDBRepository(FakeDb db) {
        this.db = db;
    }
    public void save(StudentRecord record) {
        db.save(record);
    }
    public int count() {
        return db.count();
    }
}