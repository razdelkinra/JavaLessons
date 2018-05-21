package customlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ruslan
 */
public class CustomListImplTest {

    @Test
    public void getTest() {

        CustomList<String> customList = new CustomListImpl();
        customList.add("First object");
        assertEquals(1, customList.size());
    }

    @Test
    public void removeTest() {

    }

    @Test
    public void addTest() {

    }
}
