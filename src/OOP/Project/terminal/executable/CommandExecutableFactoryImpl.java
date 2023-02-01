package OOP.Project.terminal.executable;

import OOP.Project.data.User;
import OOP.Project.db.Table;
import OOP.Project.terminal.Command;

public class CommandExecutableFactoryImpl extends Table<User> implements CommandExecutableFactory {

    @Override
    public CommandExecutable create(Command input) {

        if (input.isCreateFullCommand()) {
            return new CreateStudentExecutable(input);
        } else if (input.isDeleteCommand()) {
            return new DeleteStudentExecutable(input);
        } else if (input.isDelByNameCommand()) {
            return new DeleteStudentByNameExecutable(input);
        } else if (input.isDelByGroupAndDateCommand()) {
            return new DeleteStudentByNumberGroupAndBrsDate(input);
        } else if (input.isCreateCommand()) {
            return new CreateStudentByNameExecutable(input);
        }
        return new NoneCommandExecutable();
    }
}
