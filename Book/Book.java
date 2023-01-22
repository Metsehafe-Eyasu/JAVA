package Book;

public class Book {
    private String author;
    private String title;
    private int ISBN;

    public Book(){
        this.author = "Random Author";
        this.title = "Random Title";
        this.ISBN = 12345678;
    }
    public Book(String author, String title, int ISBN){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getISBN(){
        return ISBN;
    }
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public String toString(){
        String str = "Author: " + this.author + "\n Title: " + this.title + "\n ISBN: " + this.ISBN;
        return str;
    }
}


class LibraryBook extends Book{
    private int callNumber;
    public LibraryBook(String author, String title, int ISBN, int callNumber){
        super(author, title, ISBN);
        this.callNumber = callNumber;
    }
    public String getAuthor(){
        return super.getAuthor();
    }
    public void setAuthor(String author){
        super.setAuthor(author);
    }
    public String getTitle(){
        return super.getTitle();
    }
    public void setTitle(String title){
        super.setTitle(title);
    }
    public int getISBN(){
        return super.getISBN();
    }
    public void setISBN(int ISBN){
        super.setISBN(ISBN);
    }
}