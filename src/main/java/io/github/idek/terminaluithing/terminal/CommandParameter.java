package io.github.idek.terminaluithing.terminal;

public abstract class CommandParameter<T> {
    private T value;
    public CommandParameter(T val) {
        value = val;
    }

    public T getValue() {
        return value;
    }

    public abstract CommandParameter from(String paramString);

    public String stringRep() {
        return value.toString();
    }
}
