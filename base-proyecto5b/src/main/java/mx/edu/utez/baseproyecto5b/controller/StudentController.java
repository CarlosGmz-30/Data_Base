package mx.edu.utez.baseproyecto5b.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mx.edu.utez.baseproyecto5b.model.Alumno;

public class StudentController {
    // Zona de inicialización de los cuadros de texto :)
    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private TextField getTextField4;


    // Zona de inicialización de botones
    @FXML
    private Button buttonInsert;


    @FXML
    private Button buttonUpdate;


    @FXML
    private Button buttonDelete;

    @FXML
    private Button buttonBack;


    // Zona de las columnas de la tabla :)
    @FXML
    private TableView<Alumno> tableView;

    @FXML
    private TableColumn<Alumno, String> column1;

    @FXML
    private TableColumn<Alumno, String> column2;

    @FXML
    private TableColumn<Alumno, String> column3;

    @FXML
    private TableColumn<Alumno, String> column4;


    // Zona de acción para los botones :)
    @FXML
    protected void onInsertButtonClick() {
    }

    @FXML
    protected void onUpdateButtonClick() {
    }

    @FXML
    protected void onDeleteButtonClick() {
    }

    @FXML
    protected void onBackButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/mx.edu.utez.baseproyecto5b/menu-window.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 440);
            Stage currentStage = (Stage) buttonBack.getScene().getWindow();
            currentStage.setScene(scene);
            currentStage.setTitle("Menú");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}