package LibraryClass;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int quantity = 1;
    private int borrowLimit = 5;
    private boolean borrowable = true;

    public Book(String title, String author){
        bookTitle = title;
        bookAuthor = author;
    }
    
    public Book(String title, String author, int quantity){
        bookTitle = title;
        bookAuthor = author;
        this.quantity = quantity;    
    }

    public String getBookTitle(){
        return this.bookTitle;
    }
    public void setBookTitle(String title){
        this.bookTitle = title;
    }
    public String getBookAuthor(){
        return this.bookAuthor;
    }
    public void setBookAuthor(String title){
        this.bookAuthor = title;
    }
    public void setBorrowLimit(int limit){
        this.borrowLimit = limit;
    }

    public boolean isBorrowable(){
        return this.borrowable;
    }
    public void Borrowable(){
        if(quantity <= borrowLimit){
            this.borrowable = false;
        } else {
            this.borrowable = true;
        }
    }

}
