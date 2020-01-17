/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senhajfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Tiago
 */
public class CadastroFXController implements Initializable {

    @FXML
    private TextField tfUsername;
    @FXML
    private PasswordField tfSenha;
    @FXML
    private PasswordField tfSenha2;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfTelefone;
    @FXML
    private Button btCadastrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
