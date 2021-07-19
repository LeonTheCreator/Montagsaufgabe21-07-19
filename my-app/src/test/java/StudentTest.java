import com.mycompany.model.Student;
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
        Student student = new Student();
        student.setName(name);
        String actual = student.getName();
        //THEN
        assertEquals(name, actual);
    }

    @Test
    @DisplayName("Age cannot be negative!")
    public void ageTest() {
        //GIVEN
        int age = -42;
        //WHEN
        Student student = new Student();
        student.setAge(age);
        int actual = student.getAge();
        //THEN
        assertEquals(age, actual);
    }

    @Test
    @DisplayName("Matriukations numere cannot be empty!")
    public void matriculationNumberTest() {
        //GIVEN
        String matricultionNumber = "";
        //WHEN
        Student student = new Student();
        student.setMatricutionNumber(matricultionNumber);
        String actual = student.getMatriculationNumber();
        //THEN
        assertEquals(matricultionNumber, actual);
    }

}