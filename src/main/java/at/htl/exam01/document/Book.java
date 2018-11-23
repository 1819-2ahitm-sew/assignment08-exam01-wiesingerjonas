package at.htl.exam01.document;

public class Book extends Document{

    String title;

    public Book(String author, String title) {
        super(author);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: '" + getTitle() + "' von '" + super.getAuthor() + "'";
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle(){
        return title;
    }
}
