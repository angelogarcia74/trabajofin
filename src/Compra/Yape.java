
package Compra;

public class Yape extends BilleteraVirtual{
    private String codigoUsuarioYape;

    public Yape(String codigoUsuarioYape, String nombre, String correoElectronico, double monto) {
        super(nombre, correoElectronico, monto);
        this.codigoUsuarioYape = codigoUsuarioYape;
    }

    public String getCodigoUsuarioYape() {
        return codigoUsuarioYape;
    }

    public void setCodigoUsuarioYape(String codigoUsuarioYape) {
        this.codigoUsuarioYape = codigoUsuarioYape;
    }
    
    
}
