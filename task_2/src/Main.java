import java.lang.reflect.Member;

public class Main {


    public static void main(String[] args) {
        Library user = new User("lahiru",1);
        Library book = new Book("Title 1", "srimal","SD001");

        user.registeringMember();
        user.removingMember();

        book.addingBook();
        book.removingBook();

        user.borrowingBook();
        user.returningBook();
    }
}