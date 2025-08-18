import java.util.Scanner;
public class Computador {
    private String marca;
    private String modelo;
    int anoFabricado;
    double preco;

    //get e set
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca= marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getAnoFabricado(){
        return anoFabricado;
    }
    public void setAnoFabricado (int anoFabricado){
        this.anoFabricado= anoFabricado;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
}
