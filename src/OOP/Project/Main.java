package OOP.Project;

import OOP.Project.repository.StudentRepository;
import OOP.Project.service.StudentService;
import OOP.Project.terminal.Parser.CommandParser;
import OOP.Project.terminal.Parser.CommandParserImpl;
import OOP.Project.terminal.TerminalReader;
import OOP.Project.terminal.executable.factories.CommandExecutableFactory;
import OOP.Project.terminal.executable.factories.Loging.LogingCommandExecutableFactoryImpl;
import OOP.Project.view.TerminalView.CmdView;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        CommandExecutableFactory factory = new LogingCommandExecutableFactoryImpl(studentService);
        CommandParser commandParser = new CommandParserImpl();
        CmdView view = new CmdView();

        view.startDescription();
        TerminalReader.getInstance(commandParser,factory,view).run();
    }
}
