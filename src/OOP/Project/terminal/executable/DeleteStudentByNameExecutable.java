package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.UserService;

public class DeleteStudentByNameExecutable implements CommandExecutable {

    private final UserService<Student, Integer> studentService;
    private final String firsName;

    public DeleteStudentByNameExecutable(UserService<Student, Integer> studentService, String firsName) {
        this.studentService = studentService;
        this.firsName = firsName;
    }

    @Override
    public void execute() {
        studentService.deleteByFirstName(firsName);


    }
}
