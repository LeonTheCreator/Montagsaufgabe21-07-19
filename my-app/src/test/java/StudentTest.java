import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    @DisplayName("Name can not be empty!")
    public void nameTest(){

        //GIVEN
        String name = "";
        //WHEN
        boolean actual = Main.giveName(name);
        //THEN
        assertFalse(actual);

    }
}