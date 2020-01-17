package senhajfx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class Senha{
  
     private Sequencia senha;
      
    public Senha() {
       this.senha = new Sequencia();
       //System.out.print(this.senha.possiveis.toString());
       criar();
    }
    public Senha(int tamanho, int possibilidades){
       this.senha = new Sequencia(tamanho, possibilidades);
       criar();
    }
    public void criar(){
        // embaralha os campos possíveis e tira o excedente para
        // para a senha ficar do tamanho certo
        senha.setValores(senha.getPossiveis());
        Collections.shuffle(senha.getValores());
        for (int i = senha.getTamanho(); i <= senha.getValores().size(); i++){
            this.senha.getValores().remove(0);
                }
        //System.out.print(this.senha.getPossiveis().toString());
        //System.out.print(this.senha.getValores().toString());
        
    }

    public Sequencia getSenha() {
        return senha;
    }
    public int getTamanho() {
        return senha.getTamanho();
    }
    public int getPossibilidades() {
        return senha.getPossibilidades();
    }
    
}
