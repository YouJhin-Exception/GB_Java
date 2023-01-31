package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.StudentService;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;

import java.util.concurrent.ConcurrentMap;

public class DeleteStudentExecutable implements CommandExecutable {
    private final UserService<Student,Integer> studentService;
    private final Command command;

    public DeleteStudentExecutable(Command command) {
        this.studentService = new StudentService();  // without super !
        this.command = command;
    }

    @Override
    public void execute() {    // уместно ли здесь new ????
        studentService.deleteUser(new Student("Удаляемый"));   // проверить
    }
}
