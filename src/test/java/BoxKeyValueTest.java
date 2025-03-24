import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoxKeyValueTest {

    @Test
    public void testBox() {
        BoxKeyValue<String, Integer> box1 = new BoxKeyValue<>("string", 15);
        BoxKeyValue<String, Integer> box2 = new BoxKeyValue<>("string", 15);
        int result = box1.getValue() + box2.getValue();
        assertEquals(30, result);
    }
}