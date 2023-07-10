module com.example.jpong {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens jpong.app to javafx.fxml;
    exports jpong.app;
    exports jpong.app.Graph;
    opens jpong.app.Graph to javafx.fxml;
    exports jpong.app.GraphType;
    opens jpong.app.GraphType to javafx.fxml;
    exports jpong.app.GraphApp;
    opens jpong.app.GraphApp to javafx.fxml;
}