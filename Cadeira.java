import java.util.Scanner;
public class Cadeira {
    private String cor;
    private String modelo;
    int tempoUso;
    int preco;
    //get e set
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor= cor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getTempoUso(){
        return tempoUso;
    }
    public void setTempoUso(int tempoUso){
        this.tempoUso= tempoUso;
    }
    public int getPreco(){
        return preco;
    }
    public void setPreco(int preco){
        this.preco= preco;
    }
}

