
package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Cliente;
import persistencia.exceptions.PreexistingEntityException;


public class ControladoraPersistencia {
    
    ClienteJpaController clienteJpa = new ClienteJpaController();
    
    public void crearCliente(Cliente cliente) throws PreexistingEntityException, Exception {
        
        try {
            clienteJpa.create(cliente);
            JOptionPane.showMessageDialog(null, "Cliente agregado correctamente", "Agregado", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "El numero de cliente que queres agregar ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

}