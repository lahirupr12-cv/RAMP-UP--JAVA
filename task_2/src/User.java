public class User extends Library{
    private String name;
    private int Id;

    public User(String name, int id) {
        this.name = name;
        Id = id;
    }

    @Override
    public void addingBook() {

    }

    @Override
    public void removingBook() {

    }

    @Override
    public void registeringMember() {
        System.out.println("Add Member");
    }

    @Override
    public void removingMember() {
        System.out.println("Remove member");
    }
}
