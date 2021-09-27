/*
*Test methods for the class Cat
 */
import org.junit.*;
import static org.junit.Assert.*;

public class CatTest {
    Cat c;

    @Before
    public void setUp() throws Exception {
        c = new Cat();
    }

    @Test(timeout = 100)
    public void TestSound(){assertEquals("meow", c.sound());}

    @Test(timeout = 100)
    public void TestGetPrice(){assertEquals(2^32-1, c.getPrice());}

    @Test
    public void TesttoString(){
        String[] tokens = c.toString().split(" ");
        assertEquals("meow", tokens[tokens.length-1]);
    }
}
