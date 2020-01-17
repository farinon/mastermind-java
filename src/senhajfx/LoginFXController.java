/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senhajfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.logging.*; 

/**
 * FXML Controller class
 *
 * @author Tiago
 */
public class LoginFXController implements Initializable {

    @FXML
    private TextField tfUsername;
    @FXML
    private PasswordField tfSenha;
    @FXML
    private Button btEntrar;
    @FXML
    private Button btCancelar;
    @FXML
    private Button btCadastro;
    
    private Usuario jogador;
    private CadJogadores cadjogadores;

    @FXML
    private void btEntrarAction(ActionEvent event) throws IOException {
        Stage stage = new Stage();       
        Parent root = FXMLLoader.load(getClass().getResource("JogoFX.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        btEntrar.getScene().getWindow().hide();
        
    }
    @FXML
    private void btCadastroAction(ActionEvent event) throws IOException {
        Stage stage = new Stage();       
        Parent root = FXMLLoader.load(getClass().getResource("CadastroFX.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        btCadastro.getScene().getWindow().hide();
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
    }    
    
}
