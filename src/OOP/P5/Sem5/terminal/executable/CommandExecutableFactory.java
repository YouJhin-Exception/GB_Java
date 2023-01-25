package OOP.P5.Sem5.terminal.executable;

import OOP.P5.Sem5.terminal.Command;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);
}
