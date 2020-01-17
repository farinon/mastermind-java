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
public class Sequencia {
    private int tamanho = 4;
    private int possibilidades = 6;
    private List<String> possiveis = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K"));
    private int totalPossiveis = possiveis.size();
    private List<String> valores = new ArrayList<String>();
    
    Sequencia(){
        configurar();        
    }
    
    Sequencia(int possibilidades, int tamanho){
        this.possibilidades = possibilidades;
        this.tamanho = tamanho;
        configurar();
    }

    private void configurar(){
        Collections.sort(this.possiveis, Collections.reverseOrder());
        for (int i = possibilidades; i < totalPossiveis; i++){
            this.possiveis.remove(0);
                }
        for(int i = 0; i<tamanho;i++){
            valores.add(i, "");
       }
        System.out.print(this.possiveis.toString());        
    }
    
    public void adicionar(int i, String elemento){
       if (i<tamanho && i>=0){            
           if (possiveis.contains(elemento)){
                valores.set(i, elemento); 
           }
           else{
                System.out.println("Elemento inválido. Possibilidades: "+ possiveis.toString());
            }           
       }
       else{
           System.out.println("Local inválido. Você pode usar no máximo "+ tamanho+" elementos.");
       }
}

    public int getTamanho() {
        return tamanho;
    }

    public int getPossibilidades() {
        return possibilidades;
    }

    public List<String> getPossiveis() {
        return possiveis;
    }
    public List<String> getValores() {
        return valores;
    }

    public void setPossiveis(List<String> possiveis) {
        this.possiveis = possiveis;
    }

    public void setValores(List<String> valores) {
        this.valores = valores;
    }   
}
