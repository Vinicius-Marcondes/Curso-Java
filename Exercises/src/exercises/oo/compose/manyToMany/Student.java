package exercises.oo.compose.manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Student {
    final String name;
    final List<Course> courses = new ArrayList<>();

    Student(String name){
        this.name = name;
    }

    Course getCoursebyname(String name){
        for(Course course : this.courses){
            if(course.name.equalsIgnoreCase(name)){
                return course;
            }
        }
        return null;
    }

    public void addCourse(Course course){
        this.courses.add(course);
        course.student.add(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
