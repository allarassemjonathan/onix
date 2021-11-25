package io.github.idek.terminaluithing.terminal.Commands;

import io.github.idek.terminaluithing.terminal.Command;
import io.github.idek.terminaluithing.terminal.CommandParameter;
import io.github.idek.terminaluithing.terminal.CommandResult;
import io.github.idek.terminaluithing.terminal.SuccessResult;

import java.util.List;

public class Echo extends Command {
    public Echo() {
        super("echo", "repeats the parameters back to you");
    }

    @Override
    public CommandResult run(List<CommandParameter> params) {
        StringBuilder result = new StringBuilder();
        for (CommandParameter p: params) {
            result.append(p.stringRep());
            result.append(' ');
        }
        return new SuccessResult(result.toString());
    }
}
