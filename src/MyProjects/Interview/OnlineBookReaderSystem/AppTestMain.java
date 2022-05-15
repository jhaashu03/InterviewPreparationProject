package MyProjects.Interview.OnlineBookReaderSystem;

public class AppTestMain {
    public static void main(String[] args) {

        OnlineReaderSystem onlineReaderSystem = new OnlineReaderSystem();

        Book dsBook = new Book(1, "It contains Data Structures", "Ds");
        Book algoBook = new Book(2, "It contains Algorithms", "Algo");
        Book phyBook = new Book(3, "It contains Physics", "Phy");
        Book mathBook = new Book(4, "It contains Math", "Math");

        onlineReaderSystem.getLibrary().addBook(dsBook);
        onlineReaderSystem.getLibrary().addBook(algoBook);
        onlineReaderSystem.getLibrary().addBook(phyBook);
        onlineReaderSystem.getLibrary().addBook(mathBook);

        User user1 = new User(1, " ", "Ram");
        User user2 = new User(2, " ", "Gopal");

        onlineReaderSystem.getUserManager().addUser(user1);
        onlineReaderSystem.getUserManager().addUser(user2);

        onlineReaderSystem.getDisplay().rentBook(user1,dsBook);
        onlineReaderSystem.getDisplay().rentBook(user1,algoBook);

        onlineReaderSystem.getDisplay().rentBook(user2,phyBook);

        onlineReaderSystem.getDisplay().returnBook(phyBook,user2);

        onlineReaderSystem.getDisplay().listRentedBooksForAUser(user1);
        onlineReaderSystem.getDisplay().listRentedBooksForAUser(user2);

        onlineReaderSystem.getLibrary().removeBook(mathBook);

        onlineReaderSystem.getLibrary().listAllBooks();


    }
}
