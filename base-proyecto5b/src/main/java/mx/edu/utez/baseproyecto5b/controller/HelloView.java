package mx.edu.utez.baseproyecto5b.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloView {
    @FXML
    private TextField txtNombre;

    @FXML
    private Label welcomeText;

    @FXML
    protected void OnClickAlBoton() {
        welcomeText.setText("Bienvenido " + txtNombre.getText());
    }
}
