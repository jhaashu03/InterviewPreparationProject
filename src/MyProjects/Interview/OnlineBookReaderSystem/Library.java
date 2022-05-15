package MyProjects.Interview.OnlineBookReaderSystem;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private HashMap<Integer, Book> books;

    public Library(){
        books = new HashMap<>();
    }

    public Boolean addBook(Book book){
        if(books.containsKey(book.getBookId())){
            return false;
        }
        books.put(book.getBookId(),book);
        return true;
    }

    public boolean removeBook(Book book){
        if(!books.containsKey(book.getBookId()))
                return false;
        books.remove(book.getBookId());
        return true;
    }

    public Book findBook(int id){
        return books.get(id);
    }

    public void listAllBooks(){
        System.out.println("All available books");
        for(Map.Entry<Integer, Book> m: books.entrySet())
            if(m.getValue().isAvailable())
                System.out.println(m.getValue().getTitle()+":"+ m.getValue().getDetails());

        System.out.println("");
    }

}
