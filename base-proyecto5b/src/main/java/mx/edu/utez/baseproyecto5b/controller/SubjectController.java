package mx.edu.utez.baseproyecto5b.controller;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mx.edu.utez.baseproyecto5b.model.Materia;

public class SubjectController {
    // Zona de inicialización de los cuadros de texto :)
    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;


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
    private TableView<Materia> tableView;

    @FXML
    private TableColumn<Materia, StringProperty> column1;

    @FXML
    private TableColumn<Materia, StringProperty> column2;


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
