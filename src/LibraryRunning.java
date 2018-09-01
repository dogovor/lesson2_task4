public class LibraryRunning {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();

        b1.setName("Гарри Поттер и Философский камень");
        b1.setAuthor("Джоан Роулинг");
        b1.setPublishing("Махаон, Азбука");
        b1.setPublishYear(1997);
        b1.setQntPages(555);
        b1.setPrice(578.0);
        b1.settBinding("solid");

        b2.setName("Гарри Поттер и тайная комната");
        b2.setAuthor("Джоан Роулинг");
        b2.setPublishing("Махаон, Азбука");
        b2.setPublishYear(1998);
        b2.setQntPages(500);
        b2.setPrice(558.0);
        b2.settBinding("solid");

        b3.setName("Гарри Поттер");
        b3.setAuthor("Джоан Роулинг");
        b3.setPublishing("Махаон, Азбука");
        b3.setPublishYear(1999);
        b3.setQntPages(555);
        b3.setPrice(578.0);
        b3.settBinding("solid");

        b4.setName("Гарри Поттер 3");
        b4.setAuthor("Джоан Роулинг");
        b4.setPublishing("Махаон, Азбука");
        b4.setPublishYear(2007);
        b4.setQntPages(555);
        b4.setPrice(578.0);
        b4.settBinding("solid");

        Library library = new Library();

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);

        System.out.println(library.findAfterYear(2000));
        System.out.println();
        System.out.println(library.findAuthor("Джоан Роулинг"));
        System.out.println();
        System.out.println(library.findPublishing("Махаон, Азбука"));

    }
}
