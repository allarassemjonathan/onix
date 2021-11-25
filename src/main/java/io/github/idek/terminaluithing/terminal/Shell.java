package io.github.idek.terminaluithing.terminal;

import io.github.idek.terminaluithing.terminal.Commands.Echo;

import java.util.LinkedList;
import java.util.List;

import static java.util.List.of;

public class Shell extends Command {
    public Shell() {
        super("Shell", "The main shell");
        this.subCommands.put("echo", new Echo());
    }

    @Override
    public CommandResult run(List<CommandParameter> params) {
        String first = params.remove(0).stringRep();
        System.out.println(first);
        if(this.subCommands.containsKey(first)) {
            return runCommand(first, params);
        }
        else {
            return new ErrorResult("No such command");
        }
    }
}
