package Task_10_43;

import com.prog.lessons.Task_9_185.Task_9_185;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task_10_43Test {
Task_10_43 f = new Task_10_43();
    @Test
    public void sum() {
        assertEquals(25, f.getsumdigitsofnumber(65536));
    }
}