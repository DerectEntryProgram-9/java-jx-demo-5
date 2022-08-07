package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class TextEditorFormController {
    public MenuItem mnuNew;
    public MenuItem mnuOpen;
    public MenuItem mnuSave;
    public MenuItem mnuPrint;
    public MenuItem mnuClose;
    public MenuItem mnuCut;
    public MenuItem mnuCopy;
    public MenuItem mnuPaste;
    public MenuItem mnuSelect;
    public MenuItem mnuAbout;
    public HTMLEditor txtEditor;

    public void initialize(){

        mnuAbout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                URL resource = this.getClass().getResource("/view/AboutForm.fxml");
                Parent container = null;
                try {
                    container = FXMLLoader.load(resource);
                    Scene scene = new Scene(container);
                    Stage stage = new Stage(); // Scene is open in new stage
//                    Stage stage = (Stage) txtEditor.getScene().getWindow(); // Open in current stage
                    stage.setScene(scene);
                    stage.setTitle("About Form");
                    stage.initModality(Modality.APPLICATION_MODAL);  // Modal Window
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }

    public void mnuAboutOnAction(ActionEvent actionEvent) throws IOException {

    }
}
