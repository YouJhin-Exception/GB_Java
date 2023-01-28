package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.data.User;
import OOP.Project.service.UserService;

public class CreateStudentExecutable implements CommandExecutable {
    private final UserService<Student,Integer> studentService;
    private final User student; // заменить на комманд

    public CreateStudentExecutable(UserService<Student,Integer> studentService, User student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.createUser((Student) student); // тоже изменить
    }
}
