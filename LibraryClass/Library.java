package LibraryClass;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> bookLibrary = new ArrayList<>();
    public void addBook(){
        Scanner input = new Scanner(System.in);
        Book book;

        String title = input.next();
        String author = input.next();
        int quantity = input.nextInt();

        if(quantity < 0){
            book = new Book(title, author);
        } else {
            book = new Book(title, author, quantity);
        }

        int borrowLimit = input.nextInt();
        book.setBorrowLimit(borrowLimit);
        book.Borrowable();

        bookLibrary.add(book);
        input.close();
    }
    public void deleteBook(){
        Scanner input = new Scanner(System.in);
        String title = input.next();
        for (Book book : bookLibrary) {
            if(book.getBookTitle().equals(title)){
                bookLibrary.remove(book);
                break;
            }
        }
        input.close();
    }

}
