package classwork.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        Student studentPoxos = new Student("Aram", "poxosyan", "poxos@maol.com", 37);
        Student studentPetros = new Student("Petros", "poxosyan", "Petrod@maol.com", 33);
        Student studentMartiros = new Student("Martiros", "poxosyan", "Martiros@maol.com", 45);
        List<Student>studentList= new ArrayList<>();
        studentList.add(studentPoxos);
        studentList.add(studentPetros);
        studentList.add(studentMartiros);
        for (Student student : studentList) {
            System.out.println(student);

        }
        Collections.sort(studentList,new StudentAgeComparator());
        System.out.println("after sorting");
        for (Student student : studentList) {
            System.out.println(student);

        }

    }
}
