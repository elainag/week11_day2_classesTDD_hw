import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    Library library;

    Books book1;
    Books book2;
    Books book3;
    Books book4;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Books("IT", "Stephen King", "Horror");
        book2 = new Books("The Munro's", "Cameron McNeish", "Non Fiction");
        book3 = new Books("The Jigsaw Man", "Paul Britton", "Crime");
        book4 = new Books("GOT", "George R. R. Martin", "Fantasy");
    }

    @Test
    public void checkStockIsEmpty(){
        assertEquals(0, library.countStock());
    }

    @Test
    public void canWeAddBooksToStock(){
        library.addBook(book1);
        assertEquals(1, library.countStock());
    }

    @Test
    public void doWeHaveCapacityForMoreStock(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.countStock());
    }

}
