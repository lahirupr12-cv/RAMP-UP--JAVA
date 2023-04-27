public class Book extends Library{
    private String title, author, ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
     public void addingBook() {
         System.out.println("Add booking");
     }

     @Override
     public void removingBook() {
         System.out.println("Remove booking");
     }

    @Override
    public void registeringMember() {

    }

    @Override
    public void removingMember() {

    }

}
