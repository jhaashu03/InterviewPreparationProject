package MyProjects.Interview.OnlineBookReaderSystem;

import java.util.*;

public class Display {
    private User activeUser;
    private Book activeBook;

    List<Book> l = new ArrayList();
    HashMap<User, List<Book>> reg = new HashMap<>();

    public void displayUser(User user){
        activeUser = user;
        showUsername();
    }

    public void displayBook(Book book){
        activeBook = book;
        showBook();
    }

    private void showBook() {
        System.out.println("Book title: "+activeBook.getTitle());
    }

    private void showUsername() {
        System.out.println("User name: "+activeUser.getName());
    }

    public boolean rentBook(User user, Book book){
        if(!book.isAvailable())
            return false;
        else{
            if(reg.containsKey(user)){
                List l = reg.get(user);
                l.add(book);
                reg.put(user,l);
            }
            else{
                List<Book> newL= new ArrayList();
                newL.add(book);
                reg.put(user,newL);
            }
            book.setAvailable(false);
            return true;
        }
    }


    public void returnBook(Book book, User user){
        book.setAvailable(true);
        for(Map.Entry<User, List<Book>> set: reg.entrySet()){
            if(set.getKey().getUserId() == user.getUserId()){
                set.getValue().remove(book);
            }
        }
    }

    public void listRentedBooksForAUser(User user){
        synchronized (user){
            for(Map.Entry<User, List<Book>> set: reg.entrySet()){
                if(set.getKey().getUserId() == user.getUserId()){
                    List<Book> l1 = set.getValue();
                    if(l1.isEmpty()){
                        System.out.println(user.getDetails()+" has rented no books:");
                    }
                    else
                    {
                        System.out.println(user.getDetails()+" has following books:");
                        for(int i=0;i<l1.size();i++){
                            System.out.println(l1.get(i).getDetails()+":"+l1.get(i).getTitle());
                        }
                    }

                }
            }
            System.out.println("");
        }
    }

}
