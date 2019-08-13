
package ejemplosobreescritura;

/**
 *
 * @author john hernandez
 */
public class EjemploSobreescritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado(("juan"), 2000);
        System.out.println(empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente("karla", 3000, "finanzas");
        System.out.println(gerente.obtenerDetalles());
    }
    
}
