import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void truthTest() {
        assertEquals(true, SkillDemo.thisIsTrue());
    }
}