
import org.junit.*;

import static org.junit.Assert.*;

public class DogTest {
    Dog d;

    @Before
    public void setUp() throws Exception {
        d = new Dog();
    }

    @Test
    public void TestSound() {assertEquals("woof woof!", d.sound());}

    @Test
    public void TestGetPrice() {assertEquals(999, d.getPrice());}

}