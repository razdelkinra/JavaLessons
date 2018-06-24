package Task_10_42;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task_10_42Test {
    Task_10_42 func = new Task_10_42();

    @Test
    public void pow() {
        assertEquals(8, func.pow(2, 3)); // реформат кода просто просится
    }
}