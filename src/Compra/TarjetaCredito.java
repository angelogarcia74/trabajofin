/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compra;

/**
 *
 * @author PC
 */
public class TarjetaCredito extends Tarjeta{
    private double limiteCredito;

    public TarjetaCredito(double limiteCredito, String nombreTitular, String numeroTarjeta, int codigoSeguridad, String fechaExpiracion) {
        super(nombreTitular, numeroTarjeta, codigoSeguridad, fechaExpiracion);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    public void realizarCompra(double precio) {
        limiteCredito = limiteCredito - precio;
    }
}
