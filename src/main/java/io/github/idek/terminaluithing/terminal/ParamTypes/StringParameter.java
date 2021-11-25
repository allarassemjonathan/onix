package io.github.idek.terminaluithing.terminal.ParamTypes;

import io.github.idek.terminaluithing.terminal.CommandParameter;

public class StringParameter extends CommandParameter<String> {
    public StringParameter(String paramString) {
        super(paramString);
    }

    @Override
    public CommandParameter from(String paramString) {
        return new StringParameter(paramString);
    }
}
