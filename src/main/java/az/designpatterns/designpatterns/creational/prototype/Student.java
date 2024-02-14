package az.designpatterns.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable{

    private final List<String> students;


    public Student(){
        students = new ArrayList<>();
    }

    public Student(List<String> students){
        this.students = students;
    }

    public List<String> getStudents(){
        return students;
    }


    public void loadData(){
        students.add("Ali");
        students.add("Ahməd");
        students.add("Mikayıl");
    }


    @Override
    public Student clone() {
        List<String> temp = new ArrayList<>();
        for (String s: this.getStudents()){
            temp.add(s);
        }
        return new Student(temp);

    }
}
