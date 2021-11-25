package io.github.idek.terminaluithing.terminal.ParamTypes;

import io.github.idek.terminaluithing.terminal.CommandParameter;

public class IntParameter extends CommandParameter<Integer> {

    public IntParameter(int parseInt) {
        super(parseInt);
    }

    @Override
    public CommandParameter from(String paramString) {
        return new IntParameter(Integer.parseInt(paramString));
    }
}
