package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
     StudentList list = new StudentList();

    @BeforeEach
    void init(){
        list.addNewStudent("6710400001", "First");
        list.addNewStudent("6710400002", "Second");
        list.addNewStudent("6710400003", "Third");
        list.addNewStudent("6710400004", "Fourth");
    }

    // list test
    @Test
    void testFindStudentById(){
        assertNotEquals(null, list.findStudentById("6710400002"));
    }
    @Test
    void testGiveScoreToId(){
        list.giveScoreToId("6710400002",50);
        Student s2 = list.findStudentById("6710400002");
        assertEquals(50 , s2.getScore() );
    }
    @Test
    void testViewGradeOfId(){
        list.giveScoreToId("6710400002",65);
        Student s2 = list.findStudentById("6710400002");
        assertEquals("C" , s2.getGrade() );
    }

    @Test
    void testFilterByName(){
        StudentList s1 = list.filterByName("rst");
        Student first = list.findStudentById("6710400001");

        assertEquals("First",first.getName());
    }

    @Test
    void testAddNewStudent(){
        list.addNewStudent("6710400005", "Fifth");
        Student f5 = list.findStudentById("6710400005");
        assertEquals("Fifth",f5.getName() );

    }
}