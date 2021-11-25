package io.github.idek.terminaluithing.terminal;

public class ErrorResult implements CommandResult{
    String message;

    public ErrorResult(String message) {
        this.message = message;
    }

    @Override
    public String resultString() {
        return "Error: " + message;
    }
}
