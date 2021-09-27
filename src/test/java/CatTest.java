import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
        Cat c;

        @Before
        public void setUp() throws Exception {
            c = new Cat(10);
        }

        @Test(timeout = 50)
        public void TestGetMaxSpeed() {
            assertEquals(10, c.getMaxSpeed());
        }

        @Test(timeout = 50)
        public void TestUpgradeSpeed() {
            c.upgradeSpeed();
            assertEquals(20, c.getMaxSpeed());
        }

        @Test(timeout = 50)
        public void TestDowngradeSpeed() {
            c.downgradeSpeed();
            assertEquals(0, c.getMaxSpeed());
        }

        @Test(timeout = 50)
        public void TestGetPrice() {
            assertEquals(21000, c.getPrice());
        }

        @Test(timeout = 50)
        public void TestSound() {
            assertEquals("meow", c.sound());
    }
    }
