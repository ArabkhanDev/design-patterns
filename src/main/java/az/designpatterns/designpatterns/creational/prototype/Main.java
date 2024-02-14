package az.designpatterns.designpatterns.creational.prototype;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.loadData();

        Student student1 = student.clone();
        Student student2 = student.clone();

        List<String> list = student1.getStudents();
        list.add("Famil");
        List<String> list1 = student2.getStudents();
        list1.remove("Ali");


        System.out.println("student list " + student.getStudents());
        System.out.println("student1 list " + list);
        System.out.println("student2 list " + list1);

    }

}
