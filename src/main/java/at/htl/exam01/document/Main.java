package at.htl.exam01.document;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Rowling", "Harry Potter und der Stein der Weisen");
        Book book2 = new Book("Tolkien", "lordOfTheRings");
        Email email1 = new Email("Susi", "Bewerbung", "CoolCompany");

        Object[] objects = new Object[3];
        objects[0] = book1;
        objects[1] = email1;
        objects[2] = book2;

        int anzahlBook = 0;
        int anzahlEmail = 0;

        for (int i = 0; i < objects.length; i++) {
            if(objects[i].getClass().toString().equals("class at.htl.exam01.document.Book")){

                if(anzahlBook == 1){
                    System.out.println("Book:  '" + book1.title + "' von '" + book2.author + "'");
                }
                anzahlBook++;
            }else{
                System.out.println("Email: '");
                anzahlEmail++;
            }
        }

    }


}
