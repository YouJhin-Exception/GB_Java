package P4.Sem4.service;


import P4.Sem4.data.Student;
import P4.Sem4.data.StudentGroup;
import P4.Sem4.data.Teacher;
import P4.Sem4.data.comparators.UserComparator;
import P4.Sem4.repository.Repository;
import P4.Sem4.util.ReadFromTxt;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StudentGroupServiceImpl {

    private final Repository<StudentGroup, Integer> repository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> repository) {
        this.repository = repository;
    }


    public StudentGroup getGroup() {
        List<Student> students = ReadFromTxt.readStudent();
        Teacher teacher = ReadFromTxt.readTeacher();
        return new StudentGroup(teacher, students);

    }

    public StudentGroup getGroup(int numb) {
        List<Student> students = ReadFromTxt.readStudent();
        Teacher teacher = ReadFromTxt.readTeacher();
        return new StudentGroup(teacher, students, numb);
    }

    public void removeStudent(String firstName) {
        Iterator<Student> group = getGroup().iterator();
        while (group.hasNext()) {
            Student student = group.next();
            if (firstName.equals(student.getfNmane())) {
                group.remove();
            }
        }
    }

    public void sortStudent(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());

    }

    public void sortFNameStudent(StudentGroup studentGroup) {
        studentGroup.getStudentList().sort(new UserComparator());

    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return repository.save(studentGroup);
    }

    public StudentGroup findGroup(StudentGroup studentGroup) { //номер группы без инт
        return repository.findById(studentGroup.getGroupNumb());
    }

}
