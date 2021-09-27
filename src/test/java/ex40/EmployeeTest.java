package ex40;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.*;

public class EmployeeTest {
    @Test
    public void TestEmployeeMap() throws ParseException{
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Employee.employees.put(101, new Employee("John","Johnson","Manager",s.parse("2016-12-31")));
        Employee.employees.put(102, new Employee("Tou","Xiong","Software Engineer",s.parse("2016-10-05")));
        Employee.employees.put(103, new Employee("Michaela","Michaelson","District Manager",s.parse("2015-12-19")));
        Employee.employees.put(104, new Employee("Jake","Jacobson","Programmer"));
        Employee.employees.put(105, new Employee("Jacquelyn","Jackson","DBA"));
        Employee.employees.put(106, new Employee("Sally","Webber","Web Developer",s.parse("2015-12-18")));

        Assert.assertTrue(Employee.employees.size() == 6);
        Assert.assertTrue(Employee.search("John") == 1);
    }

    @Test
    public void TestEmployeeMap2() throws ParseException{
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Employee.employees.put(101, new Employee("John","Johnson","Manager",s.parse("2016-12-31")));
        Employee.employees.put(102, new Employee("Tou","Xiong","Software Engineer",s.parse("2016-10-05")));
        Employee.employees.put(103, new Employee("Michaela","Johnson","District Manager",s.parse("2015-12-19")));
        Employee.employees.put(104, new Employee("Johnson","Jacobson","Programmer"));

        Assert.assertTrue(Employee.employees.size() == 4);
        Assert.assertTrue(Employee.search("Johnson") == 3);
    }
}