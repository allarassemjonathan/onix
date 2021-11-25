module io.github.idek.terminaluithing {
    requires javafx.controls;
    requires javafx.fxml;

    exports io.github.idek.terminaluithing;
    exports io.github.idek.terminaluithing.UI;
    opens io.github.idek.terminaluithing.UI to javafx.fxml;
    exports io.github.idek.terminaluithing.terminal;
    opens io.github.idek.terminaluithing.terminal to javafx.fxml;
}