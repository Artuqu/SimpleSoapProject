package repository;

import org.springframework.stereotype.Service;
import student.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Mark");
        student1.setSurname("Alen");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Nicola");
        student2.setSurname("Half");

        students.add(student1);
        students.add(student2);
    }

    public Student getStudentsById(Long id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst().get();
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
