package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



    public class MainTest {

        public static void main(String []args) {

            List<Student> Students = new ArrayList<>();

            Student ob1 = new Student(123, "Jack", 22);
            Student ob2 = new Student(184, "Paul", 23);
            Student ob3 = new Student(409, "Ria", 21);
            Student ob4 = new Student(116, "Rohan", 28);
            Student ob5 = new Student(234, "Sahil", 22);

            Students.add(ob1);
            Students.add(ob2);
            Students.add(ob3);
            Students.add(ob4);
            Students.add(ob5);

            Iterator it = Students.iterator();
            while (it.hasNext()) {
                Student element = (Student) it.next();
                //System.out.print(element.getId() + " " + element.getName() + " " + element.getAge() + " ");
                //System.out.println();

            }
            MainTest obj = new MainTest();
            obj.SortStudents(Students);
        }

        public List<Student> SortStudents(List<Student> s)
        {
            if(s==null)
                return null;
            Collections.sort(s,new StudentSorter());
            Iterator it1 = s.iterator();
            while (it1.hasNext()) {
                Student element = (Student) it1.next();
                //System.out.println(element.getId() + " " + element.getName() + " " + element.getAge()+" ");
            }
            return s;
        }
    }

