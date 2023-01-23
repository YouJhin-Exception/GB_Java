package OOP.P5.Sem5.terminal.executable;

import OOP.P5.Sem5.data.Student;
import OOP.P5.Sem5.service.StudentService;

public class DeleteStudentExecutable implements CommandExecutable {
    private final StudentService studentService;
    private final Student student;

    public DeleteStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.deleteUser(student);
    }
}
