package OOP.P5.Sem5.terminal.executable;

import OOP.P5.Sem5.service.StudentService;

public class DeleteStudentByNumberGroupAndBrsDate implements CommandExecutable {
    StudentService studentService;
    int groupNumber;
    int brsDate;

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
