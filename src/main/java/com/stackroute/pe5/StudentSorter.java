package com.stackroute.pe5;


import java.util.Comparator;

public class StudentSorter implements Comparator {

        public int compare(Object o1,Object o2) {

            Student Student1=(Student)o1;
            Student Student2=(Student)o2;

            //comparing on the basis of name
            if(Student1.getAge()==Student2.getAge())
            {
                if(Student1.getId()>Student2.getId())
                    return 1;
                else
                    return -1;
            }
            else if(Student1.getAge()<Student2.getAge())
                return 1;
            else
                return -1;
        }
    }

