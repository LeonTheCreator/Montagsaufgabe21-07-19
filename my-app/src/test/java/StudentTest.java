import com.mycompany.app.Student;
import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    @DisplayName("Name cannot be empty!")
    public void nameTest() {
        //GIVEN
        String name = "";
        //WHEN
        boolean actual = Student.giveName(name);
        //THEN
        assertFalse(actual);
    }

    @Test
    @DisplayName("Age cannot be negative!")
    public void ageTest() {
        //GIVEN
        int age = -42;
        //WHEN
        boolean actual = Student.giveAge(age);
        //THEN
        assertFalse(actual);
    }

    @Test
    @DisplayName("Matriukations numere cannot be empty!")
    public void matriculationNumberTest() {
        //GIVEN
        String matricultionNumber = null;
        //WHEN
        boolean actual = Student.matriculationNumber(matricultionNumber);
        //THEN
        assertFalse(actual);
    }

}