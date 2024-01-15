package mx.edu.utez.fx5b;

import javafx.fxml.FXML;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SecondController {

    @FXML
    private Button buttonAssign;

    @FXML
    private Button buttonStudent;

    @FXML
    private Button buttonSubject;

    @FXML
    private Button buttonBack;

    @FXML
    protected void onAssignButtonClick() {

    }

    @FXML
    protected void onStudentButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage currentStage = (Stage) buttonStudent.getScene().getWindow();
            currentStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onSubjectButtonClick() {

    }

    @FXML
    protected void onCloseButtonClick() {
        Platform.exit();
        System.exit(0);
    }
}
