package curso.exercicios.oo.compose.manyToMany;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Vinicius");
        Student student2 = new Student("Ana");
        Student student3 = new Student("Alexandre");
        
        Course course1 = new Course("Java");
        Course course2 = new Course("React");
        Course course3 = new Course("Angular");
        
        course1.addStudent(student1);
        course1.addStudent(student2);
        course2.addStudent(student1);
        course2.addStudent(student3);
        student1.addCourse(course3);
        student2.addCourse(course3);
        student3.addCourse(course3);
        
        for( Student students : course1.student){
            System.out.println("I'm " + students.name + " and I'm studying " + students.courses.toString() );
        }

        Course courseFound = student1.getCoursebyname("Angular");
        if(courseFound != null){
            System.out.println("This students are coursing "+ courseFound.name + ":\n" +  courseFound.student);
        }
    }
}
