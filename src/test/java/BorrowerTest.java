import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Books book;

    @Before
    public void before(){
        borrower = new Borrower("Jean-Luc");
        book = new Books("The Jigsaw Man", "Paul Britton", "Crime");
        library = new Library(3);
    }

    @Test
    public void checkBorrowerHasAName(){
        assertEquals("Jean-Luc", borrower.getName());
    }

    @Test
    public void checkIfBorrowerHasAnyBooksOnLoan(){
        assertEquals(0, borrower.currentlyOnLoan());
    }
    @Test
    public void borrowerChecksOutABook(){
        borrower.checkedOutBooks(book);
        assertEquals(1, borrower.checkedOutBooks(book));
    }



}
