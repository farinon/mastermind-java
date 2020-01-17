package senhajfx;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Usuario implements Serializable{
    private String username;
    private String senha;
    private String nome;
    private String fone;
    private Pontuacao pontuacao;
	
	public Usuario(String username, String senha, String nome, String fone, Pontuacao pontuacao) {
		this.username = username;
		this.senha = senha;
		this.nome = nome;
		this.fone = fone;
		this.pontuacao = pontuacao;
	}
	public Usuario(String username, String senha, String nome, String fone) {
		this.username = username;
		this.senha = senha;
		this.nome = nome;
		this.fone = fone;
		this.pontuacao = new Pontuacao();
	}
	public Usuario() {
		this.username = "";
		this.senha = "";
		this.nome = "";
		this.fone = "";
		this.pontuacao = new Pontuacao();
	}

    public String getUsername() {
        return username;
    }

    public void setUsuarname(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Pontuacao getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Pontuacao pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    
}
