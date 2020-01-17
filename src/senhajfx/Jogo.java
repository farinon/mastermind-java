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
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Jogo {
    private Scanner ler = new Scanner(System.in);
    private Senha senha = new Senha();
    private int tentativas = 10;
    private Usuario jogador;
    private List<Sequencia> jogadas = new ArrayList();
    private Sequencia jogada;
    //Número de peças corretas mas fora do lugar
    private int acertoP = 0;
    //Número de peças corretas e no lugar certo
    private int acertoPL = 0;
    public Jogo(Usuario jogador){        
       this.jogador=jogador;
       //senha.criar();
       System.out.println("SENHA: "+senha.getSenha().getValores());
   }
   public void jogar(){
       jogada = new Sequencia(senha.getPossibilidades(),senha.getTamanho());
       for(int i = 0; i<jogada.getTamanho();i++){
           System.out.println((i+1)+"º caractere:" );
        jogada.adicionar(i, ler.next().toUpperCase());           
       }
       
       System.out.println("Jogada:" +jogada.getValores());
       jogadas.add(jogada);
       if(senha.getSenha().getValores().equals(jogada.getValores())){
           System.out.println("Ok Cowboy! Vc Venceu!!!" );
       jogador.getPontuacao().adicionar(tentativas);
       }
       else{
           System.out.println("Errou Mangolão!!!" );
           for(int i=0; i<senha.getTamanho();i++){
               for(int i2=0; i2<jogada.getTamanho();i2++){
                    if(i==i2){
                        if(senha.getSenha().getValores().get(i).equals(jogada.getValores().get(i2))){
                           this.acertoPL++; 
                        }                        
                    }
                    else{
                        if(senha.getSenha().getValores().get(i).equals(jogada.getValores().get(i2))){
                           this.acertoP++;
                        }  
                    }
               }
               
           }
           System.out.println("Peças no lugar certo: "+ this.acertoPL);
           System.out.println("Peças certas no lugar errado: "+ this.acertoP);
       tentativas--;
       }
   }
    
}
