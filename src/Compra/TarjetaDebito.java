
package Compra;

public class TarjetaDebito extends Tarjeta{
    private double saldoDisponible;

    public TarjetaDebito(double saldoDisponible, String nombreTitular, String numeroTarjeta, int codigoSeguridad, String fechaExpiracion) {
        super(nombreTitular, numeroTarjeta, codigoSeguridad, fechaExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
    
    public void realizarCompra(double precio) {
        saldoDisponible = saldoDisponible - precio;
    }
}
