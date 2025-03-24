import org.junit.Test;

import static org.junit.Assert.*;

public class Box3ParamsTest {

    @Test
    public void testBox() {
        Box3Params<String, Integer, Float> box1 = new Box3Params<>("Str", 2, 3.5f);
        Box3Params<String, Integer, Float> box2 = new Box3Params<>("Str", 5, 6.5f);
        float result = box1.getValue() + box1.getValue2() + box2.getValue() + box2.getValue2();
        assertEquals(17, result, 0.001);


    }

}