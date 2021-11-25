package io.github.idek.terminaluithing.terminal;

public class SuccessResult implements  CommandResult{
    String contents;

    public SuccessResult(String s) {
        contents = s;
    }

    @Override
    public String resultString() {
        return contents;
    }
}
