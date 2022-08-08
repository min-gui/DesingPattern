package Iterator;

import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);

        Book book1 = new Book("문학동네");
        Book book2 = new Book("늑대");
        Book book3 = new Book("늑대의 문장");

        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        bookShelf.appendBook(book3);

        System.out.println(bookShelf.getLength());

        Iterator it = bookShelf.createIterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
