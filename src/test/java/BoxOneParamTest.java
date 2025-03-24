import org.junit.Test;

import static org.junit.Assert.*;

public class BoxOneParamTest {

    @Test
    public void testBox() {
        BoxOneParam<Integer> box = new BoxOneParam<>(5, 10, 15);
        assertEquals(10, box.average(), 0.001);
    }

}