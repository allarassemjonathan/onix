package io.github.idek.terminaluithing.terminal;

public final class TerminalState {
    private StringBuilder commandHistory;
    private String location;
    private final static TerminalState INSTANCE = new TerminalState();

    private TerminalState() {
        commandHistory = new StringBuilder();
    }

    public static TerminalState getInstance() {
        return INSTANCE;
    }
    public void addToHistory(CommandResult toAdd) {
        commandHistory.append(toAdd.resultString());
        commandHistory.append('\n');
    }
    public void addToHistory(String toAdd) {
        commandHistory.append(toAdd);
        commandHistory.append('\n');
    }
    public String getHistory() {
        return commandHistory.toString();
    }
    public void setLocation(String location1) {
        location = location1;
    }
    public String getLocation() {
        return location;
    }
}
