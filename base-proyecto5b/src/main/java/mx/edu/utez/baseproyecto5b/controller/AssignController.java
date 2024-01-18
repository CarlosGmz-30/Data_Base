package mx.edu.utez.baseproyecto5b.controller;

import javafx.event.ActionEvent;
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
import mx.edu.utez.baseproyecto5b.model.Materia;

public class AssignController {

    public TableColumn column1;
    public TableColumn column2;
    public TableColumn column3;
    public TableColumn column4;
    public TableColumn column5;
    public TableColumn column6;

    @FXML
    private TextField searchField1;

    @FXML
    private TableView<Alumno> table1;

    @FXML
    private TextField searchField2;

    @FXML
    private TableView<Materia> table2;

    @FXML
    private Button buttonBack;

    @FXML
    private void initialize() {
    }

    @FXML
    private void buscarButtonClicked(ActionEvent event) {
    }

    @FXML
    private void asignarButtonClicked(ActionEvent event) {
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
