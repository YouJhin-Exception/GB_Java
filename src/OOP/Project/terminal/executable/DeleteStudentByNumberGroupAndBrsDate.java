package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.StudentService;
import OOP.Project.service.UserService;

public class DeleteStudentByNumberGroupAndBrsDate implements CommandExecutable {
    private final UserService<Student,Integer> studentService;
    private final int groupNumber;
    private final int brsDate;

    public DeleteStudentByNumberGroupAndBrsDate(UserService<Student, Integer> studentService, int groupNumber, int brsDate) {
        this.studentService = studentService;
        this.groupNumber = groupNumber;
        this.brsDate = brsDate;
    }

    @Override
    public void execute() {
        studentService.deleteByGroupAndBrsDate(groupNumber,brsDate);
    }
}
