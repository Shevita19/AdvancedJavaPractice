// illustrate working of comparator and some logic is in IdComparator class and NameComparator (can implement multiple logics)
//
package org.example.compare;

import java.util.ArrayList;
import java.util.Collections;


public class Employee2  {

        private String empName;
        private int empId;

        private String phone;


        public Employee2(String empName, int empId, String phone) {
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
            ArrayList <Employee2> empData =new ArrayList<>();

            empData.add(new Employee2("shweta", 10, "44444"));

            empData.add(new Employee2("saket", 20, "33333"));

            empData.add(new Employee2("ashutosh", 4, "22222"));

            System.out.println(empData);

            Collections.sort(empData, new IdComparator());  // list n compartor method
            System.out.println(empData);

           // ArrayList <Employee2> empNameWise = new ArrayList<>(empData);  //passing existing array list here
            Collections.sort(empData, new NameComparator());
            System.out.println(empData);

        }
}


//import java.util.Comparator;
//
//public class PersonComparator implements Comparator<Person> {
//    @Override
//    public int compare(Person p1, Person p2) {
//        int nameComparison = p1.getName().compareTo(p2.getName());
//        if (nameComparison != 0) {
//            return nameComparison;
//        }
//        return Integer.compare(p1.getAge(), p2.getAge());
//    }
//}

//In this example, the compare method compares two Person objects first by their name using the compareTo method of the String class.
// If the names are equal, it then compares their ages using the compare method of the Integer class.

