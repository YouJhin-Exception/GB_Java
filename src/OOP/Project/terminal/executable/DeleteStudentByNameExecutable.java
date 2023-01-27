package OOP.Project.terminal.executable;

import OOP.Project.service.StudentService;

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
