abstract class Library {
    public abstract  void addingBook();

    public abstract void removingBook();

    public abstract void registeringMember();

    public abstract void removingMember();

    public void borrowingBook(){
        System.out.println("Barrow book");
    }

    public void returningBook(){
        System.out.println("Return book");
    }
}
