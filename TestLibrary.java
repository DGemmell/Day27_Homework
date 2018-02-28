import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;

    @Before
    public void before(){
        ArrayList<Book> books = new ArrayList<Book>();
        library = new Library(books, 1000);

    };

    @Test
    public void canGetStockCapacity(){
        assertEquals(1000, Library.getStockCapacity());
    };

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1001, Library.getStockCapacity());
    };

//    ok this one i really wasn't sure so i referred to the notes for the bus and remembered Aly
//    talking about i++ yesterday. im not sure this will work however, I would like to write
//    1.measure current capacity then if capacity is <1002 then add a book.  I have added the book from the
//    Library class but wondered if this should be the Book class?
    @Test
    public void measureCapacity() {
        int i;
        for (i = 0; i <1002,i++){
            library.addBook(book);
        }
        assertEquals(1001, library.getStockCapacity() );
    }


}
