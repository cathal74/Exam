package ie.gmit;
//Cathal Walsh
//Group C
///06.06.2020

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    Employee myEmployee;


    @BeforeEach
    void setup()
    {
        myEmployee = new Employee("Mr","Cathal", 90123, "0892573644", "Fulltime", 20);
    }

    @Test
    void testConstructor()
    {
        Employee myEmployee = new Employee("Mr", "Cathal", 90123, "0892573644", "Fulltime", 20);
        assertEquals("Mr", myEmployee.getTitle());
        assertEquals("Cathal", myEmployee.getName());
        assertEquals(90123, myEmployee.getPps());
        assertEquals("0892573644", myEmployee.getPhoneNumber());
        assertEquals(20, myEmployee.getAge());
        assertEquals("Full- time", myEmployee.getType());

    }

    @Test
    void testTitle()
    {
       Exception titleException = assertThrows(IllegalAccessException.class, ()-> new Employee("", "Cathal", 90123, "0892573644", "Fulltime", 20));
       assertEquals(Error, titleException.getMessage());
    }

    @Test
    void testName()
    {
        Exception nameException = assertThrows(IllegalAccessException.class, ()-> new Employee("Mr", "", 90123, "0892573644", "Fulltime", 20));
        assertEquals(Error, nameException.getMessage());
    }

    @Test
    void testPps()
    {
        Exception ppsException = assertThrows(IllegalAccessException.class, ()-> new Employee("Mr", "Cathal", 0, "0892573644", "Fulltime", 20));
        assertEquals(Error, ppsException.getMessage());
    }

    @Test
    void testPhoneNumber()
    {
        Exception PhoneNumberException = assertThrows(IllegalAccessException.class, ()-> new Employee("Mr", "Cathal", 90123, "", "Fulltime", 20));
        assertEquals(Error, PhoneNumberException.getMessage());
    }

    @Test
    void testAge()
    {
        Exception AgeException = assertThrows(IllegalAccessException.class, ()-> new Employee("Mr", "Cathal", 90123, "0892573644", "Fulltime", 15));
        assertEquals(Error, AgeException.getMessage());
    }

    @Test
    void testType()
    {
        Exception TypeException = assertThrows(IllegalAccessException.class, ()-> new Employee("Mr", "Cathal", 90123, "0892573644", "", 20));
        assertEquals(Error, TypeException.getMessage());
    }



}
