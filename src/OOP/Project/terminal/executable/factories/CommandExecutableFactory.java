package OOP.Project.terminal.executable.factories;

import OOP.Project.terminal.Command;
import OOP.Project.terminal.executable.CommandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);
}
