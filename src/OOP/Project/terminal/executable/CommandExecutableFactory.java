package OOP.Project.terminal.executable;

import OOP.Project.terminal.Command;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);
}
