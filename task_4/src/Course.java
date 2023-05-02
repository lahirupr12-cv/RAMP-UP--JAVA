public class Course {
    private int Id;
    private String name;

    public Course(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
}
