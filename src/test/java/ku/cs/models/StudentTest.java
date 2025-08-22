package ku.cs.models;


import ku.cs.services.Datasource;
import ku.cs.services.StudentListHardCodeDatasource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;

    @BeforeEach
    void init(){
        s = new Student("62xxxx","test");
    }

    @Test
    @DisplayName("AddSCORE")
    void testAddScore(){
        s.addScore(49);
        assertEquals(49,s.getScore());
        s.addScore(2);
        assertEquals(51,s.getScore());

    }

    @Test
    void testCalculateGrade(){
        s.addScore(60);
        assertEquals("C",s.grade());
    }

    @Test
    void testChangeName(){
        s.changeName("lol");
        assertEquals("lol",s.getName());
    }

    @Test
    void testIsId(){
        assertEquals(true,s.isId("62xxxx"));
    }

    @Test
    void testIsNameContains(){
        assertEquals(true,s.isNameContains("test"));

    }

}