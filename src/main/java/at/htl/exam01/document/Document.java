package at.htl.exam01.document;

public abstract class Document {

    String author;
    public abstract  String toString();

    public Document(String author) {
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }


}
