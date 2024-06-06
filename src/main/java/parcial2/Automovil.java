package parcial2;

public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;

    public Automovil(String marca, String modelo, int año, int numeroPuertas, TipoCombustible tipoCombustible) {
       super(marca, modelo, año);
       this.numeroPuertas = numeroPuertas;
       this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String setMarca(String toyota) {
       return marca; 
    }
    public String setModelo(String Corolla) {
        return modelo;      
    }
    public int setAño(String 2020) {
        return año; 
    }
}


    
    
