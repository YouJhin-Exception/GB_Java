package OOP.Project.service;


import OOP.Project.data.Student;
import OOP.Project.data.StudentGroup;
import OOP.Project.data.Teacher;
import OOP.Project.repository.Repository;
import OOP.Project.util.ReadFromTxt;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupServiceImpl implements StudentGroupService<StudentGroup, Integer>, DataGroupSortService<StudentGroup> {
    private final Repository<StudentGroup, Integer> groupRepository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> repository) {
        this.groupRepository = repository;
    }


    @Override
    public StudentGroup getGroup() {
        List<Student> students = ReadFromTxt.readStudentsFromTxt();
        Teacher teacher = ReadFromTxt.readTeacherFromTxt();
        return new StudentGroup(teacher, students);

    }

    @Override
    public StudentGroup getGroup(int number) {
        List<Student> students = ReadFromTxt.readStudentsFromTxt();
        Teacher teacher = ReadFromTxt.readTeacherFromTxt();
        return new StudentGroup(teacher, students, number);
    }

    @Override
    public void removeStudent(String firstName, String lastName) {
        Iterator<Student> studentIterator = getGroup().iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                studentIterator.remove();
            }
        }
    }

    @Override
    public void sortUsers(StudentGroup students) {
        Collections.sort(students.getStudentList());
    }

    @Override
    public void sortByName(StudentGroup students) {
        System.out.println("нет реализации");
    }

    @Override
    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return groupRepository.save(studentGroup);
    }

    @Override
    public StudentGroup findGroupById(Integer id) {
        return groupRepository.findById(id);
    }

    @Override
    public void deleteGroup(StudentGroup students) {
        groupRepository.delete(students);
    }
}
