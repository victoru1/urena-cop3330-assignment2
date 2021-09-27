/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Victor Urena
*/

package ex40;

import java.util.Date;
import java.util.TreeMap;

class Employee {

        static TreeMap<Integer, Employee> employees = new TreeMap<>();

        private String firstName;
        private String lasstName;
        private String position;
        private Date separationDate;

        public Employee(String firstName, String lasstName, String position) {
                this.firstName = firstName;
                this.lasstName = lasstName;
                this.position = position;
        }
        public Employee(String firstName, String lasstName, String position, Date separationDate) {
                this.firstName = firstName;
                this.lasstName = lasstName;
                this.position = position;
                this.separationDate = separationDate;
        }

        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }

        public String getLasstName() { return lasstName; }
        public void setLasstName(String lasstName) { this.lasstName = lasstName; }

        public String getPosition() { return position; }
        public void setPosition(String position) { this.position = position; }

        public Date getSeparationDate() { return separationDate; }
        public void setSeparationDate(Date separationDate) { this.separationDate = separationDate; }

        @Override
        public String toString() {
                return "Employee[ " + "firstName=" + firstName + ", lasstName=" + lasstName
                        + ", position=" + position + ", separationDate=" + separationDate + " ]";
        }


        public static int search(String name){
                int count = 0;
                for(int k : employees.keySet()){
                        if(employees.get(k).getFirstName().equalsIgnoreCase(name) || employees.get(k).getLasstName().equalsIgnoreCase(name)){
                                count++;
                                System.out.println(employees.get(k));
                        }
                }
                return count;
        }
}