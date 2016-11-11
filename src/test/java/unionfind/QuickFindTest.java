package unionfind;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickFindTest {

    @Test
    public void shouldPass(){
        QuickFind qf = new QuickFind(10);
        qf.union(1, 2);
        qf.union(1, 5);
        qf.union(8, 6);

        assertTrue(qf.find(1, 2));
        assertTrue(qf.find(5, 5));
        assertTrue(qf.find(8, 6));
        assertFalse(qf.find(1, 3));
        assertFalse(qf.find(3, 4));
    }
}
