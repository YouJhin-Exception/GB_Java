package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.StudentService;
import OOP.Project.service.UserService;

public class DeleteStudentExecutable implements CommandExecutable {
    private final UserService<Student,Integer> studentService;
    private final Student student; // zamenit

    public DeleteStudentExecutable(UserService<Student, Integer> studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.deleteUser(student);
    }
}
