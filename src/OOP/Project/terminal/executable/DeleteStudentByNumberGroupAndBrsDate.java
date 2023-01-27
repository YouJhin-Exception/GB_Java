package OOP.Project.terminal.executable;

import OOP.Project.service.StudentService;

public class DeleteStudentByNumberGroupAndBrsDate implements CommandExecutable {
    StudentService studentService;
    private final int groupNumber;
    private final int brsDate;

    public DeleteStudentByNumberGroupAndBrsDate(StudentService studentService, int groupNumber, int brsDate) {
        this.studentService = studentService;
        this.groupNumber = groupNumber;
        this.brsDate = brsDate;
    }

    @Override
    public void execute() {
        studentService.deleteByGroupAndBrsDate(groupNumber,brsDate);
    }
}
