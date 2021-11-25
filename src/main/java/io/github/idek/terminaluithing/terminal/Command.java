package io.github.idek.terminaluithing.terminal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Command {
    String title;
    String description;
    Map<String, Command> subCommands;
    List<String> paramTitles;
    Map<String, CommandParameter> params;

    public Command(String title, String description) {
        this.title = title;
        this.description = description;
        this.subCommands = new HashMap<>();
        this.paramTitles = new ArrayList<>();
        this.params = new HashMap<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Command> getSubCommands() {
        return (List<Command>) subCommands.values();
    }

    ;

    public String getDescription() {
        return description;
    }

    ;

    public String getCommandDescription(String commandTitle) {
        return subCommands.get(commandTitle).getDescription();
    }

    public List<String> getParamList() {
        return paramTitles;
    }

    public List<String> getParamList(String commandTitle) {
        return subCommands.get(commandTitle).getParamList();
    }

    public abstract CommandResult run(List<CommandParameter> params);

    public CommandResult runCommand(String commandTitle, List<CommandParameter> params) {
        return subCommands.get(commandTitle).run(params);
    }
}
