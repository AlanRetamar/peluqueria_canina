
package logica;

import persistencia.ControladoraPersistencia;
import persistencia.exceptions.PreexistingEntityException;



public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public Controladora(){}
    
    public void crearCliente(Cliente cliente) throws PreexistingEntityException, Exception {
     
       controlPersis.crearCliente(cliente);
    }
    
    public void crearCliente(String num_cliente, String nombre_perro, String raza, String color, boolean alergico, boolean atención_especial, 
            String nombre_duenio, String celular_duenio, String observaciones)  throws PreexistingEntityException, Exception {
        
       Cliente cliente = new Cliente();
       cliente.setNum_cliente(num_cliente);
       cliente.setNombre_perro(nombre_perro);
       cliente.setRaza(raza);
       cliente.setColor(color);
       cliente.setAlergico(alergico);
       cliente.setAtención_especial(atención_especial);
       cliente.setNombre_duenio(nombre_duenio);
       cliente.setCelular_duenio(celular_duenio);
       cliente.setObservaciones(observaciones);
       
       controlPersis.crearCliente(cliente);
    }
}
