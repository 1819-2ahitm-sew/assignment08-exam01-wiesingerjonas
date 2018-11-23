package at.htl.exam01.document;

public class Main {

    public static void main(String[] args) {

        Document[] documents = new Document[3];
        documents[0] = new Book("Rowling", "Harry Potter und der Stein der Weisen");
        documents[1] = new Email("Susi", "CoolCompany", "Bewerbung");
        documents[2] = new Book("Tolkien", "lordOfTheRings");

        int anzahlBook = 0;
        int anzahlEmail = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(documents[i].toString());

            if(documents[i] instanceof Book){
                anzahlBook++;
            }else{
                anzahlEmail++;
            }
        }

        System.out.println();

        if(anzahlBook == 1){
            System.out.println("Anzahl Book: " + anzahlBook);
        }else{
            System.out.println("Anzahl Books: " + anzahlBook);
        }

        if(anzahlEmail == 1) {
            System.out.println("Anzahl Email: " + anzahlEmail);
        }else{
            System.out.println("Anzahl Emails: " + anzahlEmail);
        }

    }


}
