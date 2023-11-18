
import Cliente.ClientesActuales;
import Interfaces.Login;
import Interfaces.Register;
import Producto.ProductosActuales;
import java.awt.event.ActionListener;
import javax.swing.*;


public class InterfazDeCompras {
    public static void main(String[] args) {
        
        ClientesActuales clientes = new ClientesActuales();
        ProductosActuales productos = new ProductosActuales();
        
        Login login = new Login(clientes);
        login.setVisible(true);
        
        Register registrar = new Register(clientes);
        
        
        
                 
                 
        
        
        
        
        
        
        
        
    }    
}
