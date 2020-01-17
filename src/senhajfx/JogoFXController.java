/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senhajfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Tiago
 */
public class JogoFXController implements Initializable {

    @FXML
    private Button btRank;
    
    private Senha senha = new Senha();
    @FXML
    private TextField tbC1;
    @FXML
    private TextField tbC2;
    @FXML
    private TextField tbC3;
    @FXML
    private TextField tbC4;
    @FXML
    private Button btOk;
    @FXML
    private VBox vbTentativas;
    @FXML
    private Label lbNome;
    @FXML
    private Label lbTentativas;
    
    Usuario jogador = new Usuario("fulano", "1234", "Fulano de Tal", "999-6999");
    Jogo jogo = new Jogo(jogador);
    //Jogada jogada;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btRankAction(ActionEvent event) {
    }
    
   @FXML
    private void btOkAction(ActionEvent event) {
    //    jogada = new Jogada();
    //    jogo.jogar(tbC1.getText(),tbC2.getText(),tbC3.getText(),tbC4.getText());
    }
    
}
