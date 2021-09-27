/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Victor Urena
*/

package ex39;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class SortingRecords {
public static void main(String[] args)
{
Employee[] employees = {
new Employee("John","Johnson","Manager","2016-12-31"),
new Employee("Tou","Xiong","Software Engineer","2016-10-05"),
new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
new Employee("Jake","Jacobson","Programmer"," "),
new Employee("Jackquelyn", "Jackson", "DBA"," "),
new Employee("Sally","Webber","Web Developer","2015-12-18")
};

List<Employee> list = Arrays.asList(employees);

Function<Employee, String> byFirstName = Employee::getFirstName;
Function<Employee, String> byLastName = Employee::getLastName;

Comparator<Employee> lastThenFirst =
Comparator.comparing(byLastName).thenComparing(byFirstName);

System.out.printf(
"%nName                            | Position             | Separation Date%n");
System.out.printf("--------------------------------|----------------------|----------------\n");
list.stream()
.sorted(lastThenFirst)
.forEach(System.out::println);
}
}
class Employee
{
private String firstName;
private String lastName;

private String department;
private String separationDate;

public Employee(String firstName, String lastName,
String department,String separationDate)
{
this.firstName = firstName;
this.lastName = lastName;
  
this.department = department;
this.separationDate=separationDate;
}

public void setFirstName(String firstName)
{
this.firstName = firstName;
}

public String getFirstName()
{
return firstName;
}

public void setLastName(String lastName)
{
this.lastName = lastName;
}

public String getLastName()
{
return lastName;
}

public void setDepartment(String department)
{
this.department = department;
}

public String getDepartment()
{
return department;
}

public void setseparationDate(String separationDate)
{
this.separationDate = separationDate;
}

public String getseparationDate()
{
return separationDate;
}

public String getName()
{
return String.format("%s %s", getFirstName(), getLastName());
}

@Override
public String toString()
{
return String.format("%-15s %-15s | %-20s | %-15s",
getFirstName(), getLastName(), getDepartment(),getseparationDate());
}
}