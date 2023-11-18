
package Compra;

public class Plin extends BilleteraVirtual{
    private String numTelefono;

    public Plin(String numTelefono, String nombre, String correoElectronico, double monto) {
        super(nombre, correoElectronico, monto);
        this.numTelefono = numTelefono;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
    
    
}
