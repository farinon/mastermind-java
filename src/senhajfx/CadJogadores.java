package senhajfx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class CadJogadores{
	
	private List<Usuario> jogadores;

	
	public CadJogadores(){
		jogadores = new ArrayList<>();
		
		File f = new File("jogadores.dat");
		if(f.exists()==true) { //Se arquivo existe, restaura os dados
			this.recuperarObjeto();			
		}
	}
	
	public void insere(Usuario jogador){
		jogadores.add(jogador);
		
		//Sempre que insere, grava o objeto no HD
		this.gravarObjeto();
	}
		


	
	public Usuario getPrim(){
		 Usuario aux_jog=null;
		 if(!jogadores.isEmpty()){
		 	aux_jog = jogadores.get(0);
		 }
		 return aux_jog;
	}
	
	public Usuario getElemento(int pos){
		 Usuario aux_jog=null;
		 if((pos>=0) && (pos<jogadores.size())){
		 	aux_jog = jogadores.get(pos);
		 }
		 return aux_jog;
	}	
	
	public Usuario getUlt(){
		 Usuario aux_jog=null;
		 int tam=0;
		 if(!jogadores.isEmpty()){
		 	tam = this.getTam();
		 	aux_jog = jogadores.get(tam-1);
		 }
		 return aux_jog;
	}
	
	public int getTam(){
		return jogadores.size();
	}
	
	public boolean estaVazio() {
		return jogadores.isEmpty();
	}
	
	public void gravarObjeto(){
    	//Grava o ArrayList em um arquivo
		try{ 
		   	File f = new File("jogadores.dat");
			FileOutputStream saida = new FileOutputStream( f );
			ObjectOutputStream obj_saida = new ObjectOutputStream( saida );
		   
		    obj_saida.writeObject( jogadores );
		    obj_saida.close();
		}   
		catch(Exception e){
		    e.printStackTrace();    
		}
    }
	
	public void recuperarObjeto(){
		//Restaura o ArrayList do arquivo.
		try{
			File f = new File("jogadores.dat");
			FileInputStream entrada = new FileInputStream( f );
			ObjectInputStream obj_entr = new ObjectInputStream( entrada );
		
			jogadores = (ArrayList) obj_entr.readObject();
		    
		}   
		catch(Exception e){
		    e.printStackTrace();    
		}
	}
}
