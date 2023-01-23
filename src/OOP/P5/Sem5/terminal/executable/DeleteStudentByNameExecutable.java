package OOP.P5.Sem5.terminal.executable;

import OOP.P5.Sem5.data.Student;
import OOP.P5.Sem5.service.StudentService;

public class DeleteStudentByNameExecutable implements CommandExecutable {

    private final StudentService studentService;
    private final String firsName;

    public DeleteStudentByNameExecutable(StudentService studentService, String firsName) {
        this.studentService = studentService;
        this.firsName = firsName;
    }

    @Override
    public void execute() {
        studentService.deleteByFirstName(firsName);


    }
}
