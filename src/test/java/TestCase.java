import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCase {


    @Test
    public void TestCase1() {
        int[] array = new int[] {2, 3, 4, 6};

        assertFalse(Partionaling.areTheSame(array));
    }
    @Test
    public void TestCase2() {
        int[] array = new int[] {6, 6, 10};

        assertFalse(Partionaling.areTheSame(array));
    }
    @Test
    public void TestCase3() {
        int[] array = new int[] {1, 1, 3, 4, 7};

        assertTrue(Partionaling.areTheSame(array));
    }
    @Test
    public void TestCase4() {
        int[] array = new int[] {10, 15, 3, 3, 5};

        assertTrue(Partionaling.areTheSame(array));
    }
}
