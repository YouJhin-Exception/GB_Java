package OOP.Project.view.TerminalView;

import OOP.Project.terminal.Command;

public class LoggingCmdView implements LoggingView<Command>{
    @Override
    public void startLogging(Command command) {
        System.out.println("Logging started\n"+command);
    }

    @Override
    public void endLogging() {
        System.out.println("Logging finished");
    }
}
