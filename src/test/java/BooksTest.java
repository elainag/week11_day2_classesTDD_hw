import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BooksTest {

    Books books;

    @Before
    public void beforeEach(){
        books = new Books("GOT", "George R. R. Martin", "Fantasy");
    }

    @Test
    public void doTheBooksHaveTitles(){
        assertEquals("GOT", books.getTitle());
    }

    @Test
    public void doTheBooksHaveAuthors(){
        assertEquals("George R. R. Martin", books.getAuthor());
    }
    @Test
    public void doTheBooksHaveGenres(){
        assertEquals("Fantasy", books.getGenre());
    }



}
