package curso.exercicios.oo.compose.manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Course {
    final String name;
    final List<Student> student = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    void addStudent(Student student){
        this.student.add(student);
        student.courses.add(this);
    }
}
