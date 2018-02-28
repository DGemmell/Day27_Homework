import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(1000, "Cathcart Library");
        book = new Book("Stick Man", "Julia Donaldson");

    };

    @Test
    public void canGetStockCapacity(){
        assertEquals(1000, library.getStockCapacity());
    };

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooks());
    };

//    ok this one i really wasn't sure so i referred to the notes for the bus and remembered Aly
//    talking about i++ yesterday. im not sure this will work however, I would like to write
//    1.measure current capacity then if capacity is <1002 then add a book.  I have added the book from the
//    Library class but wondered if this should be the Book class?

    @Test
    public void measureCapacity() {
        int i;
        for (i = 0; i <1002; i++)
        {;
            library.addBook(book);
        }
        assertEquals(1000, library.getStockCapacity());
    }


}
