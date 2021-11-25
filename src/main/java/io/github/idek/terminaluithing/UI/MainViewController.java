package io.github.idek.terminaluithing.UI;

import io.github.idek.terminaluithing.terminal.ParamTypes.StringParameter;
import io.github.idek.terminaluithing.terminal.Shell;
import io.github.idek.terminaluithing.terminal.TerminalState;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MainViewController {
    Shell shell = new Shell();

    @FXML
    Label consoleOutput;

    @FXML
    HBox suggestionBox;

    @FXML
    Label prompt;

    @FXML
    TextField commandBox;

    @FXML
    Button commandSubmit;

    @FXML
    public void onSubmitButtonClick(ActionEvent actionEvent) {
        String command = commandBox.getCharacters().toString();
        commandBox.clear();
        TerminalState.getInstance().addToHistory(prompt.getText() + command);
        TerminalState.getInstance().addToHistory(
                shell.run(Arrays.stream(command.split(" ")).map(
                        x -> new StringParameter(x)
                ).collect(Collectors.toList()))
        );
        consoleOutput.setText(TerminalState.getInstance().getHistory());
        prompt.setText(TerminalState.getInstance().getLocation() + ">");
    }

    @FXML
    public void initialize() {
        TerminalState.getInstance().setLocation("~");
        prompt.setText(TerminalState.getInstance().getLocation() + ">");
    }
}
