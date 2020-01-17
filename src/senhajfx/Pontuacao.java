package senhajfx;


import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Pontuacao implements Serializable{
    private int total;
    private int partidas;
    private int ultima;

    public Pontuacao() {
        this.total= 0;
        this.partidas=0;
        this.ultima=0;
    }
    
    public Pontuacao(int total, int partidas, int ultima) {
        this.total = total;
        this.partidas = partidas;
        this.ultima = ultima;
    }

    public void adicionar(int pontos) {
        this.ultima = pontos;
        this.partidas++;
        this.total = this.total+pontos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public int getUltima() {
        return ultima;
    }

    public void setUltima(int ultima) {
        this.ultima = ultima;
    }
    
    

}
