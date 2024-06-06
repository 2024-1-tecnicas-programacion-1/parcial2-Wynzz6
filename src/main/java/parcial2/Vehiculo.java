package parcial2;

public class Vehiculo {
   String marca;
    String modelo;
    int año;

    public Vehiculo(String marca, String modelo, int año) {
       this.marca = marca;
       this.modelo = modelo;
       this.año = año;
    }

   public String imprimirInformacion() {
        return marca + ", " + modelo + ", " + año; 
    }
    protected String getMarca() {
        return marca;
    }
    protected String getModelo() {
        return modelo; 
        
    }
    protected int getAño() {
        return año; 
        
    }
}
