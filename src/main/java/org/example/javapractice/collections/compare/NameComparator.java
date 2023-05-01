package org.example.javapractice.collections.compare;

import java.util.Comparator;

public class NameComparator implements Comparator <Employee2> {


    @Override
    public int compare(Employee2 o1, Employee2 o2) {

        return o1.getEmpName().compareTo(o2.getEmpName());


    }
}
