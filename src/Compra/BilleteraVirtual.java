
package Compra;

public class BilleteraVirtual {
    private String nombre;
    private String correoElectronico;
    private double monto;

    public BilleteraVirtual(String nombre, String correoElectronico, double monto) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public void realizarCompra(double precio) {
        monto =  monto - precio;        
    }
}
