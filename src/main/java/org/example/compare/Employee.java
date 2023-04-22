//Working of comparable - single logic

package org.example.compare;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable <Employee> {

        private String empName;
        private int empId;

        private String phone;

    @Override
    public int compareTo(Employee o) {       //Comparable is an interface and has compareTo method

        return this.empId - o.empId;  // will display data in ascending order

       // return o.empId - this.empId; // will display data in descending order
    }

    public Employee(String empName, int empId, String phone) {
        this.empName = empName;
        this.empId = empId;
        this.phone = phone;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList <Employee > empRecord =new ArrayList<>();   //creates a new ArrayList object named empRecord that can hold objects of type Employee.


        empRecord.add(new Employee("shweta", 10, "44444"));

        //adds a new Employee object to the empRecord list using the add method. The new keyword is used to create a new instance of the Employee class
        // with the name "shweta", age 10, and identification number "44444". This new Employee object is then added to the empRecord list.


        empRecord.add(new Employee("saket", 20, "33333"));

        empRecord.add(new Employee("ashutosh", 4, "22222"));


        System.out.println(empRecord);     // will display classname with hashcode so to displau exact values we need to use toString method

       // Collections.sort(empRecord);  // will give error- no instance(s) of type variable(s) T exist so that Employee conforms to Comparable<? super

        //so to sort acc to any field we use comparator(multiple logic) and comparable (single logic)


        //comparable

        Collections.sort(empRecord);    //empRecord is a list -- After creating compareTo method and implementing comparable this will work and display sorted data by id
        System.out.println(empRecord);

    }


}
