package Iterator;

import java.util.Iterator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;


    public BookShelf(int size) {
        books = new Book[size];
    }

    public Book getBooks(int index) {
        return books[index];
    }

    public int getLength() {
        return last;
    }

    public void appendBook(Book book) {
        if (last < books.length) {
            this.books[last] = book;
            last++;
        } else {
            System.out.println("책꽂이가 꽉 찼습니다!");
        }
    }


    @Override
    public Iterator createIterator() {
        return new BookShelfIterator(this);
    }
}
