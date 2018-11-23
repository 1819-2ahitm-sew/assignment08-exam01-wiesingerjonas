package at.htl.exam01.document;

public class Email extends Document{

    String subject, to;

    public Email(String author, String to, String subject) {
        super(author);
        this.to = to;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Email: '" + getSubject() + "' von '" + getAuthor() + "' an '" + getTo() + "'";
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

}

