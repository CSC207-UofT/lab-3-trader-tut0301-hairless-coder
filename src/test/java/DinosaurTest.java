import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinosaurTest {
    Dinosaur d;

    @Before
    public void setUp() throws Exception {
        d = new Dinosaur();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Dinosaur~", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(101, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(99, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100000000, d.getPrice());
    }
}
