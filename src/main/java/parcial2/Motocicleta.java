package parcial2;

public class Motocicleta extends Vehiculo {
  TipoMotocicleta tipoMotocicleta;
    
    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
    }
    
    
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ", " + tipoMotocicleta;
}

    Object getTipoMotocicleta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setMarca(String honda) {
        return Marca; 
    }

    void setModelo(String cbR500R) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setAño(int año) {
        
    }

    void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

