package at.htl.exam01.document;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sie die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {

        Book book1 = new Book("Rowling", "Harry Potter und der Stein der Weisen");
        Book book2 = new Book("Tolkien", "lordOfTheRings");
        Email email1 = new Email("Susi", "Bewerbung", "CoolCompany");

        Object[] objects = new Object[3];
        objects[0] = book1;
        objects[1] = email1;
        objects[2] = book2;

        for (int i = 0; i < objects.length; i++) {
            if(objects[i].getClass().toString().equals("class at.htl.exam01.document.Book")){
                System.out.println("Book: '" + objects[i].);
            }
        }

    }


}
